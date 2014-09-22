package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(377); 
	
	def sqrt(x: Double) = {
	
		def abs(x: Double) = if (x < 0) -x else x
	
		def sqrtIter(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sqrtIter(improve(guess))
		
		def isGoodEnough(guess: Double) =
				abs(guess * guess - x) / x < 0.001
				
		def improve(guess: Double) =
			(guess + x / guess) / 2
	

	 	sqrtIter(1.0)
	};System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 
	
	sqrt(9);System.out.println("""res0: Double = """ + $show(res$0));$skip(11); val res$1 = 
	sqrt(100);System.out.println("""res1: Double = """ + $show(res$1));$skip(12); val res$2 = 
	sqrt(1e60);System.out.println("""res2: Double = """ + $show(res$2))}
}
