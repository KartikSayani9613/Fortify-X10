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

public class array{
	
	public static def main(args:Rail[String]){
		var a:Array_1[Double] = new Array_1[Double](10000n, (i:Long):Double => {return (i/1000.0f);
	});
	var b:Array_1[Double] = new Array_1[Double](50000n, (i:Long):Double => {return (i/1000.0f);
	});
	var c:Array_1[Double] = new Array_1[Double](80000n, (i:Long):Double => {return (i/1000.0f);
	});
	val start = nanoTime();
	finish{async{
						finish for(i in 0n..(10000n-1)) async{
							a(i)=SQRT(((Math.pow(a(i),2n))+(Math.pow(a(i),3n))));
						
							}
					}async{
						finish for(i in 0n..(50000n-1)) async{
							b(i)=SQRT(((Math.pow(b(i),2n))+(Math.pow(b(i),3n))));
						
							}
					}async{
						finish for(i in 0n..(80000n-1)) async{
							c(i)=SQRT(((Math.pow(c(i),2n))+(Math.pow(c(i),3n))));
						
							}
					}}
	Console.OUT.println(a(1000n));
	val fin = (nanoTime()-start);
	Console.OUT.println(fin);
	
	
	}
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
	static def SQRT(x:Double) = Math.sqrt(x);
}
