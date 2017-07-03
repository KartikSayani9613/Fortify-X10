import x10.io.Console;
import x10.lang.Math;
import x10.array.Array_1;
import x10.array.Array_2;
import x10.array.Array_3;
import x10.util.Random;
/*needs to import
*/
/*exports
export Executable
*/

public class buffons{
	
	public static def main(args:Rail[String]){
		val needleLength:Double = 20.0f as Double;
	val numRows:Double = 10.0f as Double;
	val tableHeight:Double = (needleLength*numRows) as Double;
	var hits:Double = 0.0f as Double;
	var n:Double = 0.0f as Double;
	val start:Double = nanoTime() as Double;
	println("Starting parallel Buffons");
	finish for(i in 1n..3000n) async{
		val delta_X = (random(2.0f)-1.0f);
	val delta_Y = (random(2.0f)-1.0f);
	val rsq = ((Math.pow(delta_X,2n))+(Math.pow(delta_Y,2n)));
	if(((0.0f < rsq)&&(rsq < 1.0f))){
	val y1 = (tableHeight*random(1.0f));
	val y2 = (y1+(needleLength*(delta_Y/sqrt(rsq))));
	val y_L = min(y1,y2);
	val y_H = max(y1,y2);
	val temp1:Double = (y_L/needleLength) as Double;
	val temp2:Double = (y_H/needleLength) as Double;
	if((Math.ceil(temp1) == Math.floor(temp2))){
	atomic{
		hits = (hits+1.0f);
	}
	
	}
	atomic{
		n = (n+1.0f);
	}
	
	}
	
		}
	val probability = (hits/n);
	val pi_est = (2.0f/probability);
	print("hits = ");
	print(hits);
	print(" n = ");
	print(n);
	print("Buffons: estimated Pi = ");
	print(pi_est);
	val fin = (nanoTime()-start);
	println((fin/1000000.0f));
	
	
	}
	public static def println[T](x:T){Console.OUT.println("\n"+x);}
	static def print[T](x:T){Console.OUT.print(x);}
	public static def nanoTime() = System.nanoTime();
	static def min(x:Double, y:Double) = Math.min(x, y);
	static def min(x:Long, y:Long) = Math.min(x, y);
	static def min(x:Int, y:Int) = Math.min(x, y);
	static def min(x:Float, y:Float) = Math.min(x, y);
	static def max(x:Long, y:Long) = Math.max(x, y);
	static def max(x:Double, y:Double) = Math.max(x, y);
	static def max(x:Int, y:Int) = Math.max(x, y);
	static def max(x:Float, y:Float) = Math.max(x, y);
	static def random(x:Double){
		var r:Random = new Random();
		return x*r.nextDouble()-1.0d;
	}
	static def sqrt(x:Double) = Math.sqrt(x);
}
