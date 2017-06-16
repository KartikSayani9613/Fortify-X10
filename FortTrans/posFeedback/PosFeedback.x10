package posFeedback;
import x10.array.Array_2;
import x10.util.concurrent.AtomicInteger;
import x10.array.Array;
import x10.util.Random;
public class PosFeedback {
	public static def main(args:Rail[String]) {
		
		if(args.size!=1)
			Console.OUT.println("Invalid Usage");
		var t:Long = -System.nanoTime();
		val max:Long = 4000000/Long.parse(args(0));
		// for(i in 0..4000){
		// 	var known:Rail[Int] = [1n, 5n];
		// 	var kfacts:Rail[Int] = new Rail[Int](2);
		// 	val entity = new Entity(0n, known, kfacts);
		// 	while(!entity.tick()){}
		// }
		finish for(p in Place.places()){
			at (p) async
			{
				var m:Long = here.id();
				for(i in (m*max)..((m+1)*max-1)){
					async{
						var known:Rail[Int] = [1n, 5n];
						var kfacts:Rail[Int] = new Rail[Int](2);
						val entity = new Entity(0n, known, kfacts);
						while(!entity.tick()){}
					}
				}	
			}
			
		}
		
		t += System.nanoTime();
		Console.OUT.println("Operation took: "+t/(1000*1000));
		// Console.OUT.println(Stats.asString());
	}
}

class Stats{

	static val maxTime = 365;
	static val posOut = 1;
	static val negOut = 0;
	static val histogram:Array_2[Int] = new Array_2[Int](2, 365);
	static val overAYear = new AtomicInteger(0n);
	static val scale:Rail[Double] = new Rail[Double](1);
	static def max(array:Array_2[Int]){
		var max:Int = 0n;
		for(i in array)
			if(max<i)
				max = i;
		return max;
	}
	static def asString(){
		var res:Rail[Int] = median((0..364), new Rail[Int](365, (i:Long)=>(histogram(0, i)+histogram(1, i))));
		val n = res(0) + overAYear.intValue();
		val med = res(1);
		
		res = median((0..364), new Rail[Int](365, (i:Long)=>(histogram(posOut, i))));
		val pos = res(0);
		val posMed = res(1);

		res = median((0..364), new Rail[Int](365, (i:Long)=>(histogram(negOut, i))));
		val neg = res(0);
		val negMed = res(1);

		var maxEntry:Int = max(histogram);


		scale(0) = 30.0d/maxEntry;

		var histo:String = "Stats:\n n = "+fmt3(n)+"\tmedian = "+fmt3(med)
							+"\npos = "+fmt3(pos)+"\t"+percent(pos, n)+"%\tmedian = " + fmt3(posMed)
							+"\nneg = "+fmt3(neg)+"\t"+percent(neg, n)+"%\tmedian = " + fmt3(negMed)
							+"\nover= "+fmt3(overAYear.intValue())+"\t"+percent(overAYear.intValue(), n)+"%"
							+"Histogram:\n";
		for(i in 0..364)
			histo+=showHist(i as Int);
		return histo;
	}

	
	static def median(gen:LongRange, bucket:Rail[Int]){
		var n:Int = 0n;
		for(i in gen){
			n += bucket(i)*i;
		}
		var half:Double = n/2d;
		var s:Int = 0n;
		var med:Int = 0n;
		for(i in gen){
			if(s<= half){
				med = i as Int;
				s = (s + bucket(i)*i) as Int;
			}
		}
		var res:Rail[Int] = new Rail[Int](2);
		res(0) = n;
		res(1) = med;
		return res;
	}
	
	static def barlen(i:Int){
		if(i>0n){
			if(scale(0) * i > 1n)
				return (scale(0) * i) as Int;
			else 
				return 1n;
		}
		else
			return 0n;
	}

	static def repeat(times:Int, s:String){
		var retS:String = "";
		for(i in 0..(times-2)){
			retS = retS + s;
		}
		return retS;
	}
	
	static def percent(a:Int, b:Int){
		val x = (200n*a+b)/(2n*b) as Int;
		return fmt3(x);
	}

	

	static def fmt3(i:Int){
		if(i<10n){
			var s:String = "   ";	
			return s+i;
		}
		else if(i<100n){
			var s:String = "  ";	
			return s+i;
		}
		else if(i<1000n){
			var s:String = " ";	
			return s+i;
		}
		else{
			var s:String = "";	
			return s+i;
		}
			
		
	}
	
	static def showHist(i:Int) {
		val ng = histogram(negOut, i) as Int;
		val ps = histogram(posOut, i) as Int;
		var retVal:String = "";
		if(ng+ps != 0n){
			retVal = retVal + "\n" + fmt3(i) + ":" + fmt3(ps) + "|" + fmt3(ng);
			
			val scn = barlen(ng);
			val scp = barlen(ps);
			retVal = retVal + repeat(32n-scp, " ") + repeat(scp, "+")	+ "|" + repeat(scn, "-");
		}
		else
			retVal = retVal + "\n" + fmt3(i);
		return retVal;
	}
	
	static def recordOver(){
		overAYear.getAndIncrement();
	}
	
	static def record(time:Int, result:Int){
		if(time >= maxTime)
			Console.OUT.println("Recording Overtime"+time);
		else{
			atomic histogram(result, time)+=1n;
		}
	}
}

class Entity{
	var positivity:Int;
	var known:Rail[Int];
	var initFacts:Rail[Int];
	var time:Int = -1n;
	var factNeg:Int = -1n;
	var factPos:Int = 1n;
	var factUnk:Int = 0n;
	var facts:Rail[Int] = new Rail[Int](10);

	public def this(p:Int, k:Rail[Int], i:Rail[Int]){
		positivity = p;
		known = k;
		initFacts = i;
		filler();
	}
	private def filler(){
		val negFacts = initFacts(0);
		val totFacts = negFacts + initFacts(1);
		for(i in 0..9)
			if(i<negFacts)
				facts(i) = factNeg;
			else if(i<totFacts)
				facts(i) = factPos;
			else
				facts(i) = factUnk;
	}
	
	def asString(){
		return "Entity("+positivity+", ["+known(0)+" "+known(1)+"]) t = "+time+"\n"+facts;
	}

	def otherResult(result:Int){
		return (1n-result as Int);
	}

	def eventToResult(kind:Int){
		val res:Int = (kind+1n)/2n;
		return res;
	}

	def unlearn(fact:Int, kind:Int){
		facts(fact) = factUnk;
		val result = otherResult(eventToResult(kind));
		known(result)-=1n;
		if(known(result)<0)
			Console.OUT.println("Result "+result+" dipped below 0!");
	}

	def learn(fact:Int, kind:Int){
		facts(fact) = kind;
		val result = eventToResult(kind);
		known(result)+=1n;
		if(known(0) + known(1) >= 10 && known(result) >= 2n*known(otherResult(result))){
			Stats.record(time, result);
			return true;
		}
		else
			return false;
	}

	def event(kind:Int){
		positivity += kind;
		val r = new Random();
		val fact = r.nextInt(10n);
		if(facts(fact) == kind)
			return false;
		else if(facts(fact) == 0n)
			return learn(fact, kind);
		else{
			unlearn(fact, kind);
			return false;
		}
	}

	def min(a:Int, b:Int){
		if(a<b)
			return a;
		else
			return b;
	}

	def tick(){
		time+=1n;
		val r = new Random();
		val roll = r.nextInt(21n);
		var bot:Int;
		var top:Int;
		if(positivity >= 0n){
			bot = 1n + positivity;
			top = 19n;
		}
		else{
			bot = 1n;
			top = 19n + positivity;
		}

		if(time >= 365n){
			Stats.recordOver();
			return true;
		}

		else if(roll < min(bot, 19n))
			return event(factPos);
		else if(roll >= top)
			return event(factNeg);
		else
			return false;
	}
	
}