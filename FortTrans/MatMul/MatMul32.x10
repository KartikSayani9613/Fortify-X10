
package MatMul;
import x10.array.Array_2;
import x10.io.Console;
import x10.regionarray.Array;
import x10.regionarray.Region;
public class MatMul32{
	
	public static def ma16(a:Array_2[Int], b:Array_2[Int]){
		var c:Array_2[Int] = new Array_2[Int](16, 16);
		finish for(i in 0..15){
			for(j in 0..15){
				async{
					c(i, j) = a(i, j) + b(i, j);
				}
			}
		}
		return c;
	}

	public static def ma8(a:Array_2[Int], b:Array_2[Int]){
		var c:Array_2[Int] = new Array_2[Int](8, 8);
		finish for(i in 0..7){
			for(j in 0..7){
				async{
					c(i, j) = a(i, j) + b(i, j);
				}
			}
		}
		return c;
	}

	public static def ma4(a:Array_2[Int], b:Array_2[Int]){
		var c:Array_2[Int] = new Array_2[Int](4, 4);
		finish for(i in 0..3){
			for(j in 0..3){
				async{
					c(i, j) = a(i, j) + b(i, j);
				}
			}
		}
		return c;
	}

	public static def ma2(a:Array_2[Int], b:Array_2[Int]){
		var c:Array_2[Int] = new Array_2[Int](2, 2);
		finish for(i in 0..1){
			for(j in 0..1){
				async{
					c(i, j) = a(i, j) + b(i, j);
				}
			}
		}
		return c;
	}

	public static def mm2(a:Array_2[Int], b:Array_2[Int]){
		val A00:Int = a(0, 0);
		val A01:Int = a(0, 1);
		val A10:Int = a(1, 0);
		val A11:Int = a(1, 1);
		val B00:Int = b(0, 0);
		val B01:Int = b(0, 1);
		val B10:Int = b(1, 0);
		val B11:Int = b(1, 1);
		val P0:Int;
		val P1:Int;
		val P2:Int;
		val P3:Int;
		val P4:Int;
		val P5:Int;
		val P6:Int;
		val P7:Int;
		finish{
			async{P0 = A00*B00;}
			async{P1 = A01*B10;}
			async{P2 = A00*B01;}
			async{P3 = A01*B11;}
			async{P4 = A10*B00;}
			async{P5 = A11*B10;}
			async{P6 = A10*B01;}
			async{P7 = A11*B11;}
		}
		var C00:Int;
		var C10:Int;
		var C01:Int;
		var C11:Int;
		finish{
			async{C00 = P0 + P1;}
			async{C01 = P2 + P3;}
			async{C10 = P4 + P5;}
			async{C11 = P6 + P7;}
		}
		var c:Array_2[Int] = new Array_2[Int](2, 2);
		c(0, 0) = C00;
		c(0, 1) = C01;
		c(1, 0) = C10;
		c(1, 1) = C11;

		return c;
	}

	public static def mm4(a:Array_2[Int], b:Array_2[Int]){
		val A00:Array_2[Int];
		val A01:Array_2[Int];
		val A10:Array_2[Int];
		val A11:Array_2[Int];
		val B00:Array_2[Int];
		val B01:Array_2[Int];
		val B10:Array_2[Int];
		val B11:Array_2[Int];
		finish{
			async{A00 = new Array_2[Int](2, 2, (i:Long, j:Long)=>a(i, j));}
			async{A01 = new Array_2[Int](2, 2, (i:Long, j:Long)=>a(i, j+2));}
			async{A10 = new Array_2[Int](2, 2, (i:Long, j:Long)=>a(i+2, j));}
			async{A11 = new Array_2[Int](2, 2, (i:Long, j:Long)=>a(i+2, j+2));}
			async{B00 = new Array_2[Int](2, 2, (i:Long, j:Long)=>b(i, j));}
			async{B01 = new Array_2[Int](2, 2, (i:Long, j:Long)=>b(i, j+2));}
			async{B10 = new Array_2[Int](2, 2, (i:Long, j:Long)=>b(i+2, j));}
			async{B11 = new Array_2[Int](2, 2, (i:Long, j:Long)=>b(i+2, j+2));}
		}
		val P0:Array_2[Int];
		val P1:Array_2[Int];
		val P2:Array_2[Int];
		val P3:Array_2[Int];
		val P4:Array_2[Int];
		val P5:Array_2[Int];
		val P6:Array_2[Int];
		val P7:Array_2[Int];
		finish{
			async{P0 = mm2(A00, B00);}
			async{P1 = mm2(A01, B10);}
			async{P2 = mm2(A00, B01);}
			async{P3 = mm2(A01, B11);}
			async{P4 = mm2(A10, B00);}
			async{P5 = mm2(A11, B10);}
			async{P6 = mm2(A10, B01);}
			async{P7 = mm2(A11, B11);}
		}
		var C00:Array_2[Int];
		var C01:Array_2[Int];
		var C10:Array_2[Int];
		var C11:Array_2[Int];
		finish{
			async{C00 = ma2(P0, P1);}
			async{C01 = ma2(P0, P1);}
			async{C10 = ma2(P0, P1);}
			async{C11 = ma2(P0, P1);}
		}
		var c:Array_2[Int] = new Array_2[Int](4, 4);
		finish for(i in 0..1){
			for(j in 0..1){
				async{
					c(i, j) = C00(i, j);
					c(i, j+2) = C01(i, j);
					c(i+2, j) = C10(i, j);
					c(i+2, j+2) = C11(i, j);
				}
			}
		}
		return c;
	}

	public static def mm8(a:Array_2[Int], b:Array_2[Int]){
		val A00:Array_2[Int];
		val A01:Array_2[Int];
		val A10:Array_2[Int];
		val A11:Array_2[Int];
		val B00:Array_2[Int];
		val B01:Array_2[Int];
		val B10:Array_2[Int];
		val B11:Array_2[Int];

		finish{
			async{A00 = new Array_2[Int](4, 4, (i:Long, j:Long)=>a(i, j));}
			async{A01 = new Array_2[Int](4, 4, (i:Long, j:Long)=>a(i, j+4));}
			async{A10 = new Array_2[Int](4, 4, (i:Long, j:Long)=>a(i+4, j));}
			async{A11 = new Array_2[Int](4, 4, (i:Long, j:Long)=>a(i+4, j+4));}
			async{B00 = new Array_2[Int](4, 4, (i:Long, j:Long)=>b(i, j));}
			async{B01 = new Array_2[Int](4, 4, (i:Long, j:Long)=>b(i, j+4));}
			async{B10 = new Array_2[Int](4, 4, (i:Long, j:Long)=>b(i+4, j));}
			async{B11 = new Array_2[Int](4, 4, (i:Long, j:Long)=>b(i+4, j+4));}
		}

		val P0:Array_2[Int];
		val P1:Array_2[Int];
		val P2:Array_2[Int];
		val P3:Array_2[Int];
		val P4:Array_2[Int];
		val P5:Array_2[Int];
		val P6:Array_2[Int];
		val P7:Array_2[Int];
		finish{
			async{P0 = mm4(A00, B00);}
			async{P1 = mm4(A01, B10);}
			async{P2 = mm4(A00, B01);}
			async{P3 = mm4(A01, B11);}
			async{P4 = mm4(A10, B00);}
			async{P5 = mm4(A11, B10);}
			async{P6 = mm4(A10, B01);}
			async{P7 = mm4(A11, B11);}
		}

		var C00:Array_2[Int];
		var C01:Array_2[Int];
		var C10:Array_2[Int];
		var C11:Array_2[Int];
		finish{
			async{C00 = ma4(P0, P1);}
			async{C01 = ma4(P0, P1);}
			async{C10 = ma4(P0, P1);}
			async{C11 = ma4(P0, P1);}
		}

		var c:Array_2[Int] = new Array_2[Int](8, 8);
		finish for(i in 0..3){
			for(j in 0..3){
				async{
					c(i, j) = C00(i, j);
					c(i, j+4) = C01(i, j);
					c(i+4, j) = C10(i, j);
					c(i+4, j+4) = C11(i, j);
				}
			}
		}
		return c;
	}

	public static def mm16(a:Array_2[Int], b:Array_2[Int]){
		val A00:Array_2[Int];
		val A01:Array_2[Int];
		val A10:Array_2[Int];
		val A11:Array_2[Int];
		val B00:Array_2[Int];
		val B01:Array_2[Int];
		val B10:Array_2[Int];
		val B11:Array_2[Int];

		finish{
			async{A00 = new Array_2[Int](8, 8, (i:Long, j:Long)=>a(i, j));}
			async{A01 = new Array_2[Int](8, 8, (i:Long, j:Long)=>a(i, j+8));}
			async{A10 = new Array_2[Int](8, 8, (i:Long, j:Long)=>a(i+8, j));}
			async{A11 = new Array_2[Int](8, 8, (i:Long, j:Long)=>a(i+8, j+8));}
			async{B00 = new Array_2[Int](8, 8, (i:Long, j:Long)=>b(i, j));}
			async{B01 = new Array_2[Int](8, 8, (i:Long, j:Long)=>b(i, j+8));}
			async{B10 = new Array_2[Int](8, 8, (i:Long, j:Long)=>b(i+8, j));}
			async{B11 = new Array_2[Int](8, 8, (i:Long, j:Long)=>b(i+8, j+8));}
		}

		val P0:Array_2[Int];
		val P1:Array_2[Int];
		val P2:Array_2[Int];
		val P3:Array_2[Int];
		val P4:Array_2[Int];
		val P5:Array_2[Int];
		val P6:Array_2[Int];
		val P7:Array_2[Int];
		finish{
			async{P0 = mm8(A00, B00);}
			async{P1 = mm8(A01, B10);}
			async{P2 = mm8(A00, B01);}
			async{P3 = mm8(A01, B11);}
			async{P4 = mm8(A10, B00);}
			async{P5 = mm8(A11, B10);}
			async{P6 = mm8(A10, B01);}
			async{P7 = mm8(A11, B11);}
		}

		var C00:Array_2[Int];
		var C01:Array_2[Int];
		var C10:Array_2[Int];
		var C11:Array_2[Int];
		finish{
			async{C00 = ma8(P0, P1);}
			async{C01 = ma8(P0, P1);}
			async{C10 = ma8(P0, P1);}
			async{C11 = ma8(P0, P1);}
		}

		var c:Array_2[Int] = new Array_2[Int](16, 16);
		finish for(i in 0..7){
			for(j in 0..7){
				async{
					c(i, j) = C00(i, j);
					c(i, j+8) = C01(i, j);
					c(i+8, j) = C10(i, j);
					c(i+8, j+8) = C11(i, j);
				}
			}
		}
		return c;
	}

	public static def mm32(a:Array_2[Int], b:Array_2[Int]){
		val A00:Array_2[Int];
		val A01:Array_2[Int];
		val A10:Array_2[Int];
		val A11:Array_2[Int];
		val B00:Array_2[Int];
		val B01:Array_2[Int];
		val B10:Array_2[Int];
		val B11:Array_2[Int];

		finish{
			async{A00 = new Array_2[Int](16, 16, (i:Long, j:Long)=>a(i, j));}
			async{A01 = new Array_2[Int](16, 16, (i:Long, j:Long)=>a(i, j+16));}
			async{A10 = new Array_2[Int](16, 16, (i:Long, j:Long)=>a(i+16, j));}
			async{A11 = new Array_2[Int](16, 16, (i:Long, j:Long)=>a(i+16, j+16));}
			async{B00 = new Array_2[Int](16, 16, (i:Long, j:Long)=>b(i, j));}
			async{B01 = new Array_2[Int](16, 16, (i:Long, j:Long)=>b(i, j+16));}
			async{B10 = new Array_2[Int](16, 16, (i:Long, j:Long)=>b(i+16, j));}
			async{B11 = new Array_2[Int](16, 16, (i:Long, j:Long)=>b(i+16, j+16));}
		}

		val P0:Array_2[Int];
		val P1:Array_2[Int];
		val P2:Array_2[Int];
		val P3:Array_2[Int];
		val P4:Array_2[Int];
		val P5:Array_2[Int];
		val P6:Array_2[Int];
		val P7:Array_2[Int];
		finish{
			async{P0 = mm16(A00, B00);}
			async{P1 = mm16(A01, B10);}
			async{P2 = mm16(A00, B01);}
			async{P3 = mm16(A01, B11);}
			async{P4 = mm16(A10, B00);}
			async{P5 = mm16(A11, B10);}
			async{P6 = mm16(A10, B01);}
			async{P7 = mm16(A11, B11);}
		}

		var C00:Array_2[Int];
		var C01:Array_2[Int];
		var C10:Array_2[Int];
		var C11:Array_2[Int];
		finish{
			async{C00 = ma16(P0, P1);}
			async{C01 = ma16(P0, P1);}
			async{C10 = ma16(P0, P1);}
			async{C11 = ma16(P0, P1);}
		}

		var c:Array_2[Int] = new Array_2[Int](32, 32);
		finish for(i in 0..15){
			for(j in 0..15){
				async{
					c(i, j) = C00(i, j);
					c(i, j+16) = C01(i, j);
					c(i+16, j) = C10(i, j);
					c(i+16, j+16) = C11(i, j);	
				}
			}
		}
		return c;
	}

	public static def main(args:Rail[String]) {
		val a:Array_2[Int] = new Array_2[Int](32, 32, 1n);
		var b:Array_2[Int] = new Array_2[Int](32, 32, 9n);
		var t:Long = -System.nanoTime();
		val c = mm32(a, b);
		t += System.nanoTime();
		Console.OUT.println("In time:"+t/(1000*1000));
	}
}