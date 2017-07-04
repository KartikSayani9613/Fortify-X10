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

public class factorial{
	
	public static def main(args:Rail[String]){
		val start:Int = 0n as Int;
	val fin:Int = 20n as Int;
	finish for(i in 0n..(20n-1)) async{
		Console.OUT.println("fact("+i+")="+fact(i as Long));
	
		}
	
	
	}
	static def fact(i:Long):Long{
		if((i < 2n)){
	return 1n;
	
	}
	else{
	return (i*fact((i-1n)));
	}
	
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
