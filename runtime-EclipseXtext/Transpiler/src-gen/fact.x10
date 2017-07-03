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

public class fact{
	
	public static def main(args:Rail[String]){
		var facts:Int =  as Int;
	for(i in 0n..20n){
		val j:Long = i as Long as Long;
	print("factorial(");
	print(j);
	print(")= ");
	println(fact(j));
	
		}
	
	
	}
	static def fact(x:Long):Long{
		if((x < 2n)){
	return 1n;
	
	}
	else{
	return (x*fact((x-1n)));
	}
	
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
