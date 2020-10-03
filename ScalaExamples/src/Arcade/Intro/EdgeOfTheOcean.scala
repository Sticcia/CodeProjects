package Arcade.Intro

class EdgeOfTheOcean {

	def adjacentElementsProduct(inputArray: Array[Int]): Int = {
		var aux = 0
		var result = Int.MinValue

		for(i <- 0 until inputArray.length - 1) {
		  aux = inputArray(i) * inputArray(i + 1)
			if (aux > result) {
				result = aux
			}
		}

		result
	}

	def shapeArea(n: Int): Int = {
		var result = 1

		for(i <- 0 until n) {
		  result += i * 4
			println(result)
		}

		result
	}

	def makeArrayConsecutive2(statues: Array[Int]): Int = {
		statues.max - statues.min - statues.length + 1
	}

	def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
		var count = 0
		
		for (i <- 0 until sequence.length - 1) {
			if (sequence(i) - sequence(i + 1) >= 0) {
				count += 1
				if (i - 1 >= 0 && i + 2 <= sequence.length - 1
					&& sequence(i) - sequence(i + 2) >= 0
					&& sequence(i - 1) - sequence(i + 1) >= 0) {
					return false
				}
			}
		}
		
		count <= 1
	}
	
	def matrixElementsSum(matrix: Array[Array[Int]]): Int = {
		var result = 0
		var zeros = Array[Int]()
		
		for (i <- matrix.indices) {
			for (j <- matrix(i).indices) {
				if (!zeros.contains(j)) {
					if (matrix(i)(j) == 0) {
						zeros = zeros :+ j
					} else {
						result += matrix(i)(j)
					}
				}
			}
		}
		
		result
	}

}
