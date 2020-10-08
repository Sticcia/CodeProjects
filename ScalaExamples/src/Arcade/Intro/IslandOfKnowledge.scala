package Arcade.Intro

class IslandOfKnowledge {
	
	def areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean = {
		(yourLeft == friendsLeft || yourLeft == friendsRight) && (yourRight == friendsLeft || yourRight == friendsRight)
	}
	
	def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
		inputArray.sliding(2).map(p => math.abs(p(0) - p(1))).max
	}
	
	def isIPv4Address(inputString: String): Boolean = {
		inputString.matches("\\b((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])(\\.|$)){4}\\b")
	}
	
	def avoidObstacles(inputArray: Array[Int]): Int = {
		(1 to (inputArray.max + 1)).find(i => inputArray.forall(_ % i != 0)).get
	}
	
	def boxBlur(image: Array[Array[Int]]): Array[Array[Int]] = {
		val result = Array.ofDim[Int](image.length - 2, image(0).length - 2)
		
		for (i <- 1 until image.length - 1) {
			for (j <- 1 until image(i).length - 1) {
				result(i - 1)(j - 1) = (image(i - 1)(j - 1) + image(i)(j - 1) + image(i + 1)(j - 1) + image(i - 1)(j) + image(i)(j) + image(i + 1)(j) + image(i - 1)(j + 1) + image(i)(j + 1) + image(i + 1)(j + 1)) / 9
			}
		}
		
		result
	}
	
	def minesweeper(matrix: Array[Array[Boolean]]): Array[Array[Int]] = {
		val result = Array.ofDim[Int](matrix.length, matrix(0).length)
		
		for (i <- matrix.indices) {
			for (j <- matrix(i).indices) {
				for (k <- i - 1 to i + 1) {
					for (l <- j - 1 to j + 1) {
						if (k >= 0 && k < matrix.length && l >= 0 && l < matrix(i).length
							&& !(k == i && j == l) && matrix(k)(l)) {
							result(i)(j) += 1
						}
					}
				}
			}
		}
		
		result
	}
	
}
