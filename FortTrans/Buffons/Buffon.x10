package Buffons;

import x10.io.Console;
import x10.util.concurrent.AtomicInteger;
import x10.util.Random;

public class Buffon {
	static val hits = new AtomicInteger(0n);
	static val n = new AtomicInteger(0n);

	public static def main(args:Rail[String]) {
		val needleLength = 20.0d;
		val numRows = 10.0d;
		val tableHeight = needleLength * numRows;
		var start:long = -System.nanoTime();
	 	Console.OUT.println("Starting Parallel Buffons");
	 	val r = new Random();
	 	
	 	//This is the Parallel Version:


	 	val max:Long = 40000/Long.parse(args(0));
	 		finish for(p in Place.places()){
			at (p) async
			{
				var m:Long = here.id();
				for(i in (m*max)..((m+1)*max-1)){
					async{
						val delta_x = 2.0d*r.nextDouble() - 1.0d;
						val delta_y = 2.0d*r.nextDouble() - 1.0d;
						val rsq = Math.pow(delta_x, 2) + Math.pow(delta_y, 2);
						if (0.0d < rsq && rsq < 1.0d){
							val y1 = tableHeight * r.nextDouble();
							val y2 = y1 + needleLength*(delta_y/Math.sqrt(rsq));
							val y_L = Math.min(y1, y2);
							val y_H = Math.max(y1, y2);
							val temp1 = y_L/ needleLength;
							val temp2 = y_H/ needleLength;
							if(Math.ceil(temp1) == Math.floor(temp2)){
								hits.incrementAndGet();
							}
							n.incrementAndGet();
						}
					}
			 	}
			}
		}

		//This is the Sequential Version:


		// for(i in 0..40000){
		// 	val delta_x = 2.0d*r.nextDouble() - 1.0d;
		// 	val delta_y = 2.0d*r.nextDouble() - 1.0d;
		// 	val rsq = Math.pow(delta_x, 2) + Math.pow(delta_y, 2);
		// 	if (0.0d < rsq && rsq < 1.0d){
		// 		val y1 = tableHeight * r.nextDouble();
		// 		val y2 = y1 + needleLength*(delta_y/Math.sqrt(rsq));
		// 		val y_L = Math.min(y1, y2);
		// 		val y_H = Math.max(y1, y2);
		// 		val temp1 = y_L/ needleLength;
		// 		val temp2 = y_H/ needleLength;
		// 		if(Math.ceil(temp1) == Math.floor(temp2)){
		// 			hits.incrementAndGet();
		// 		}
		// 		n.incrementAndGet();
		// 	}
		// }

	 	val probability = hits.floatValue()/n.floatValue();
	 	val pi_est = 2.0/probability;
	 	start += System.nanoTime();
	 	Console.OUT.println("Startin parallel Buffons");
	 	Console.OUT.println("Hits:\t"+hits+"\tn:\t"+n);
	 	Console.OUT.println("Buffons: estimated Pi = "+pi_est+" took time "+start/(1000*1000));
	}
}