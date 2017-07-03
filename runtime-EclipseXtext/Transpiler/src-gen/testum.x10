import x10.io.Console;
import x10.lang.Math;
import x10.array.Array_1;
import x10.array.Array_2;
import x10.array.Array_3;
/*needs to import
*/
/*exports
export Executable
*/

public class testum{
	
	//FnDecl
	//Statements
	//DelimExpr//Do//DoFront//BlockElems
	//BlockElem//Statements
	{//DelimExpr//Do//DoFront//BlockElems
	//BlockElem//Statements
	some = some
	//BlockElem//Statements
	some = soeme
	//DelimExpr//Do//DoFront//BlockElems
	//BlockElem//Statements
	some = some
	}
	//BlockElem//Statements
	some = some
	//BlockElem//Statements
	val needleLength:Double = 20n as Double;
	//BlockElem//Statements
	val numRows:Double = 10.0f as Double;
	//BlockElem//Statements
	val tableHeight:Double = (needleLength*numRows) as Double;
	//BlockElem//Statements
	var hits:Double = 0.0f as Double;
	//BlockElem//Statements
	var n:Double = 0.0f as Double;
	//BlockElem//Statements
	val start:Double = nanoTime() as Double;
	//BlockElem//Statements
	println("Starting parallel Buffons")
	//BlockElem//Statements
	val delta_X = (random(2.0f)-1.0f)
	//BlockElem//Statements
	val delta_Y = (random(2.0f)-1.0f)
	//BlockElem//Statements
	val rsq = ((Math.pow(delta_X,2n))+(Math.pow(delta_Y,2n)))
	//BlockElem//Statements
	val y1 = (tableHeight*random(1.0f))
	//BlockElem//Statements
	val y2 = (y1+(needleLength*(delta_Y/sqrt(rsq))))
	//BlockElem//Statements
	finish {
	async{ y_L = min(y1,y2)}
	async{ y_H = max(y1,y2)}
	}
	//BlockElem//Statements
	val temp1:Double = (y_L/needleLength) as Double;
	//BlockElem//Statements
	val temp2:Double = (y_H/needleLength) as Double;
	//BlockElem//Statements
	//DelimExpr//Do//DoFront//BlockElems
	//BlockElem//Statements
	hits = (hits+1.0f)
	//BlockElem//Statements
	//DelimExpr//Do//DoFront//BlockElems
	//BlockElem//Statements
	n = (n+1.0f)
	//BlockElem//Statements
	val probability = (-(hits)/n)
	//BlockElem//Statements
	val piest = (2.0f/probability)
	//BlockElem//Statements
	print("hits=")
	//BlockElem//Statements
	print(hits)
	//BlockElem//Statements
	print(" n=")
	//BlockElem//Statements
	print(n)
	//BlockElem//Statements
	print("Buffons: estimated Pi = ")
	//BlockElem//Statements
	print(pi_est)
	//BlockElem//Statements
	val finish = (nanoTime()-start)
	//BlockElem//Statements
	println("Time Taken ",finish," nanoseconds")
	public static def println[T](x:T){Console.OUT.println(x);}
	static def print[T](x:T){Console.OUT.print(x);}
	public static def nanoTime() = System.nanoTime();
	static def min(x:Double, y:Double) = Math.min(x, y);
	static def min(x:Long, y:Long) = Math.min(x, y);
	static def min(x:Int, y:Int) = Math.min(x, y);
	static def min(x:Float, y:Float) = Math.min(x, y);
	static def max(x:Long, y:Long) = Math.max(x, y);
	static def max(x:Double, y:Double) = Math.max(x, y);
	static def max(x:Int, y:Int) = Math.min(x, y);
	static def max(x:Float, y:Float) = Math.min(x, y);
	static def random(x:Double){
		var r = new Random();
		return x*r.nextDouble()-1.0d;
	}
	static def sqrt(x:Double) = Math.sqrt(x);
}
