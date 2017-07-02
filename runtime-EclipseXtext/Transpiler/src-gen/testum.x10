import x10.io.Console;
import x10.lang.Math;
import x10.array.Array_1;
import x10.array.Array_2;
import x10.array.Array_3;
/*needs to import
*/
/*exports
export srf.transpiler.fortxtrans.fortXTrans.impl.QualifiedNameImpl@1483cb30 (dots: null)
*/

public class testum{
	
	private var x:Long = func(20n) as Long;
	private var x:Bool= true;
	private var y:Double = 20.0f as Double;
	private var z:Double = func(20n) as Double;
	static val x:Double = name as Double;
	static val y:Double = (30n+30n) as Double;
	//FnDecl
	//Statements
	//DelimExpr//Do//DoFront//BlockElems
	//BlockElem//Statements
	//LocalVar (((20n+20n)*20n)*20n)
	public static def println[T](x:T){
		return Console.OUT.println(x);
	}
	
	public static def nanoTime(){
		return System.nanoTime();
	}
	static def min(x:Double, y:Double) = Math.min(x, y);
	static def min(x:Long, y:Long) = Math.min(x, y);
	static def min(x:Int, y:Int) = Math.min(x, y);
	static def min(x:Float, y:Float) = Math.min(x, y);
	static def max(x:Long, y:Long) = Math.max(x, y);
	static def max(x:Double, y:Double) = Math.max(x, y);
	static def max(x:Int, y:Int) = Math.min(x, y);
	static def max(x:Float, y:Float) = Math.min(x, y);
}
