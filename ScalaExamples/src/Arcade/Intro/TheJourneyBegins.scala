package Arcade.Intro

class TheJourneyBegins {

	def add(param1: Int, param2: Int): Int = {
		param1 + param2;
	}

	def centuryFromYear(year: Int): Int = {
		(year - 1) / 100 + 1
	}

	def checkPalindrome(inputString: String): Boolean = {
		inputString.reverse equals inputString
	}

}
