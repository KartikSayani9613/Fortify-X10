package stream;

import x10.io.Console;
public class istream {
	static val N:Int = 5000000n;
	static val tim:Rail[Double] = new Rail[Double](5);
	static val HLINE:String = "---------------------------------------------------";

	static def timDiffMS(start:Double, fin:Double){
		return (fin - start)/1000000000d;
	}

	static def bench[T](z:T, o:T, t:T, s:T, ss:Long)
	{T<:Arithmetic[T]}{
		var st:Long = 0;
		var fin:Long = 0;
		Console.OUT.println("Filling...");
		val a:Rail[T] = new Rail[T](N as Long, o);
		a.fill(o);
		val b:Rail[T] = new Rail[T](N as Long, o);
		b.fill(t);
		val c:Rail[T] = new Rail[T](N as Long, o);
		c.fill(z);
		
		val slice: Long = (N-1)/Place.numPlaces();

		Console.OUT.println("Filled...");

		if(s instanceof Int)
		Console.OUT.println("Integer");
		else if(s instanceof Long)
		Console.OUT.println("Long");
		else if(s instanceof Double)
		Console.OUT.println("Double");
		else
		{
			Console.OUT.println("Unimplemented Type");
			return;
		}

		Console.OUT.println("Copying...");
		st = System.nanoTime();
		finish for(p in Place.places()){
			async at(p){
				var h:Long = here.id();
				for(i in (h*slice)..((h+1)*slice) )	{
					async{
						c(i)= a(i);
					}
				}
			}
		}
		fin = System.nanoTime();
		tim(0)= timDiffMS(st, fin);

		Console.OUT.println("Scaling...");
		st = System.nanoTime();
		finish for(p in Place.places()){
			async at(p){
				var h:Long = here.id();
				for(i in (h*slice)..((h+1)*slice) )	{
					async{
						b(i)= s * c(i);
					}
				}
			}
		}
		fin = System.nanoTime();
		tim(1)= timDiffMS(st, fin);

		Console.OUT.println("Adding...");
		st = System.nanoTime();
		finish for(p in Place.places()){
			async at(p){
				var h:Long = here.id();
				for(i in (h*slice)..((h+1)*slice) )	{
					async{
						c(i)= a(i) + b(i);
					}
				}
			}
		}
		fin = System.nanoTime();
		tim(2)= timDiffMS(st, fin);

		Console.OUT.println("Triad...");
		st = System.nanoTime();
		finish for(p in Place.places()){
			async at(p){
				var h:Long = here.id();
				for(i in (h*slice)..((h+1)*slice) )	{
					async{
						a(i)= b(i) + s*c(i);
					}
				}
			}
		}
		fin = System.nanoTime();
		tim(3)= timDiffMS(st, fin);

		if( o instanceof Long | o instanceof Int)
		{
			Console.OUT.println("Sscale...");
			val d:Rail[Long] = new Rail[Long](N as Long);
			// d.fill(o as Long);
			val e:Rail[Long] = new Rail[Long](N as Long);
			// e.fill(z as Long);
			st = System.nanoTime();
			finish for(p in Place.places()){
				async at(p){
					var h:Long = here.id();
					for(i in (h*slice)..((h+1)*slice) )	{
						async{
							e(i)= d(i)<<ss;
						}
					}
				}
			}
			fin = System.nanoTime();
			tim(4)= timDiffMS(st, fin);	
		}
		
	}

	public static def main(args:Rail[String]) {

		var numtests : Int = 0n;
		var testid:Rail[String] = ["Copy","Scale","Add","Triad","Sscale"];
		var bytesize:Rail[Double] = new Rail[Double](5);

		bytesize(0) = 2d*4d*N;
		bytesize(1) = 2d*4d*N;
		bytesize(2) = 3d*4d*N;
		bytesize(3) = 2d*4d*N;
		bytesize(4) = 2d*4d*N;

		var Offset :Int = 0n;
///////////////////////////////////////////
// 		Integer Test

		var my_zero_l : Int = 0n;
		var my_one_l : Int = 1n;
		var my_two_l : Int = 2n;
		var my_three_l : Int = 3n;

		Console.OUT.println("The data type is 32-bit int");
		Console.OUT.println("This system uses 4 bytes per Element being tested");
		Console.OUT.println("Array size = "+N+", Offset = "+Offset);
		Console.OUT.println("Total memory required = "+(3.0*4*N/1048576.0d)+" MB.");

		bench(my_zero_l,my_one_l,my_two_l,my_three_l, 0);
		
		Console.OUT.println("Function     Rate (MB/s) Avg time");
		for (i in 0..3){
			var ttt:Double = bytesize(i)/(tim(i)*1000000);
			Console.OUT.println(testid(i)+"   " +ttt +"   "+tim(i));
		}
		Console.OUT.println(HLINE);
///////////////////////////////////////////
//		Long Test
		var my_zero_ll : Long = 0;
		var my_one_ll : Long = 1;
		var my_two_ll : Long = 2;
		var my_three_ll : Long = 3;

		Console.OUT.println("The data type is 64-bit int");
		Console.OUT.println("This system uses 8 bytes per Element being tested");
		Console.OUT.println("Array size = "+N+", Offset = "+Offset);
		Console.OUT.println("Total memory required = "+(3.0*8*N / 1048576.0)+" MB.");

		bench(my_zero_ll,my_one_ll,my_two_ll,my_three_ll, 0);
		numtests = 4n;
		Console.OUT.println("Function     Rate (MB/s) Avg time");
		for(i in 0..numtests){
			var ttt:Double = 2*bytesize(i)/(tim(i)*1000000);
			Console.OUT.println(testid(i)+"   " +ttt+ "   " +tim(i));
		}
		Console.OUT.println(HLINE);


///////////////////////////////////////////
//		Double Test
		var my_zero_d : Double = 0.0d;
		var my_one_d : Double = 1.0d;
		var my_two_d : Double = 2.0d;
		var my_three_d : Double = 3.0d;

		Console.OUT.println("The data type is double");
		Console.OUT.println("This system uses 8 bytes per Element being tested");
		Console.OUT.println("Array size = "+N+", Offset = "+Offset);
		Console.OUT.println("Total memory required = "+(3.0*8*N / 1048576.0)+" MB.");

		bench(my_zero_d,my_one_d,my_two_d,my_three_d, 0);

		numtests = 3n;
		Console.OUT.println("Function     Rate (MB/s) Avg time");
		for(i in 0..numtests){
			var ttt:Double = 2*bytesize(i)/(tim(i)*1000000);
			Console.OUT.println(testid(i)+ "   " +ttt +"   " +tim(i));
		}
		Console.OUT.println(HLINE);
//////////////////////////////////////////
//		Float Test

		Console.OUT.println("The data type is float");
		Console.OUT.println("This system uses 8 bytes per Element being tested");
		Console.OUT.println("Array size = "+N+", Offset = "+Offset);
		Console.OUT.println("Total memory required = "+(3.0*4*N / 1048576.0)+" MB.");
		var my_zero_f : Float = 0.0f;
		var my_one_f : Float = 1.0f;
		var my_two_f : Float = 2.0f;
		var my_three_f : Float = 3.0f;

		bench(my_zero_f,my_one_f,my_two_f,my_three_f, 0);
		numtests = 3n;
		Console.OUT.println("Function     Rate (MB/s) Avg time");
		for(i in 0..numtests){
			var ttt:Double = bytesize(i)/(tim(i)*1000000);
			Console.OUT.println(testid(i)+ "   " +ttt +"   " +tim(i));
		}
		Console.OUT.println(HLINE);
	}

}