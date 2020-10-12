package Arcade.TheCore

class IntroGates {
	
	def addTwoDigits(n: Int): Int = {
		n % 10 + n / 10
	}
	
	def largestNumber(n: Int): Int = {
		math.pow(10, n).toInt - 1
	}
	
	def candies(n: Int, m: Int): Int = {
		(m / n) * n
	}
	
	def seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int = {
		(nCols - col + 1) * (nRows - row)
	}
	
	def maxMultiple(divisor: Int, bound: Int): Int = {
		bound - bound % divisor
	}
	
	def circleOfNumbers(n: Int, firstNumber: Int): Int = {
		(firstNumber + (n / 2)) % n
	}
	
	def lateRide(n: Int): Int = {
		((n / 60) / 10) + ((n / 60) % 10) + ((n % 60) / 10) + ((n % 60) % 10)
	}
	
	def phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int = {
		if (s < min1) {
			return 0
		} else if (s < min1 + 9 * min2_10) {
			return 1 + (s - min1) / min2_10
		}
		10 + (s - min1 - 9 * min2_10) / min11
	}
	
}
