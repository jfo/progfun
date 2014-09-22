package week1

object session {
	
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
	}                                         //> sqrt: (x: Double)Double
	
	sqrt(9)                                   //> res0: Double = 3.00009155413138
	sqrt(100)                                 //> res1: Double = 10.000052895642693
	sqrt(1e60)                                //> res2: Double = 1.0000788456669446E30
}