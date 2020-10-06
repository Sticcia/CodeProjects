package Arcade.Intro

class SmoothSailing {
	
	def allLongestStrings(inputArray: Array[String]): Array[String] = {
		var aux = 0
		
		for (a <- inputArray) {
			if (a.length > aux) {
				aux = a.length
			}
		}
		
		inputArray.filter(s => s.length == aux)
	}
	
	def commonCharacterCount(s1: String, s2: String): Int = {
		s1.toSeq.intersect(s2).length
	}
	
	def isLucky(n: Int): Boolean = {
		n.toString.substring(0, n.toString.length / 2).sum == n.toString.substring(n.toString.length / 2).sum
	}
	
	def sortByHeight(a: Array[Int]): Array[Int] = {
		for (i <- a.indices) {
			for (j <- i + 1 until a.length) {
				if (a(i) > a(j) && a(i) != -1 && a(j) != -1) {
					val tmp = a(i)
					a(i) = a(j)
					a(j) = tmp
				}
			}
		}
		
		a
	}
	
	def reverseInParentheses(inputString: String): String = {
		if (!inputString.contains("(")) {
			inputString
		} else {
			val a = inputString.lastIndexOf("(")
			val b = inputString.indexOf(")", a)
			reverseInParentheses(inputString.take(a) + inputString.slice(a + 1, b).reverse + inputString.drop(b + 1))
		}
	}
	
}
