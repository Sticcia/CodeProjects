package Arcade.Intro

class ThroughTheFog {
	
	def circleOfNumbers(n: Int, firstNumber: Int): Int = {
		(firstNumber + (n / 2)) % n
	}
	
	def depositProfit(deposit: Int, rate: Int, threshold: Int): Int = {
		var result = 0
		var aux = deposit
		
		while (aux < threshold) {
			aux += aux * rate / 100
			result += 1
		}
		
		result
		
		// or
		// math.ceil(math.log(threshold.toDouble / deposit) / math.log(1.0 + rate.toDouble / 100)).toInt
	}
	
	def absoluteValuesSumMinimization(a: Array[Int]): Int = {
		var result = 0
		var aux = Int.MaxValue
		
		for (i <- a) {
			var tmp = 0
			for (j <- a) {
				tmp += math.abs(j - i)
			}
			if (tmp < aux) {
				aux = tmp
				result = i
			}
		}
		
		result
		
		// or
		// a((a.length-1)/2)
	}
	
	def stringsRearrangement(inputArray: Array[String]): Boolean = {
		inputArray.permutations.exists { p =>
			p.sliding(2).forall { s =>
				(s(0) zip s(1)).count(p => p._1 != p._2) == 1
			}
		}
	}
	
}
