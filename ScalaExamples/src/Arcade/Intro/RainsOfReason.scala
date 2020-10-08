package Arcade.Intro

class RainsOfReason {
	
	def arrayReplace(inputArray: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {
		inputArray.map(e => if (e == elemToReplace) substitutionElem else e)
	}
	
	def evenDigitsOnly(n: Int): Boolean = {
		n.toString.forall(_.toInt % 2 == 0)
	}
	
	def variableName(name: String): Boolean = {
		name.matches("(?!\\d)\\w+")
	}
	
	def alphabeticShift(inputString: String): String = {
		inputString.map(e => if (e == 'z') 'a' else (e.toInt + 1).toChar)
	}
	
	def chessBoardCellColor(cell1: String, cell2: String): Boolean = {
		cell1.sum % 2 == cell2.sum % 2
	}
	
}
