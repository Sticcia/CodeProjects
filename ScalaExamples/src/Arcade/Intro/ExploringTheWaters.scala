package Arcade.Intro

class ExploringTheWaters {
	
	def alternatingSums(a: Array[Int]): Array[Int] = {
		val result = Array(0, 0)
		
		for (i <- a.indices) {
			result(i % 2) += a(i)
		}
		
		result
	}
	
	def addBorder(picture: Array[String]): Array[String] = {
		var result = picture
		
		for (i <- result.indices) {
			result(i) = "*" + result(i) + "*"
		}
		
		result +:= "*" * result(0).length
		result :+= "*" * result(0).length
		
		result
	}
	
	def areSimilar(a: Array[Int], b: Array[Int]): Boolean = {
		var swapped = 0
		var tmp = 0
		var index = 0
		
		if (a sameElements b) {
			return true
		} else {
			for (i <- a.indices) {
				if (a(i) != b(i)) {
					if (swapped == 0) {
						tmp = a(i)
						index = i
					} else if (swapped == 1) {
						a(index) = a(i)
						a(i) = tmp
					} else {
						return false
					}
					swapped += 1
				}
			}
		}
		
		a sameElements b
	}
	
	def arrayChange(inputArray: Array[Int]): Int = {
		var result = 0
		
		for (i <- 1 until inputArray.length) {
			while (inputArray(i - 1) >= inputArray(i)) {
				inputArray(i) += 1
				result += 1
			}
		}
		
		result
	}
	
	def palindromeRearranging(inputString: String): Boolean = {
		var result = true
		var centerSkipped = false
		
		inputString.toSeq.distinct.foreach(c => {
			if (!(inputString.count(_ == c) % 2 == 0)) {
				if (!centerSkipped) {
					centerSkipped = true
				} else {
					result = false
				}
			}
		})
		
		result
	}
	
}
