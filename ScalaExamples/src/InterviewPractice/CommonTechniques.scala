package InterviewPractice

class CommonTechniques {
	
	def containsDuplicates(a: Array[Int]): Boolean = {
		a.distinct.length != a.length
	}
	
	def sumOfTwo(a: Array[Int], b: Array[Int], v: Int): Boolean = {
		a.exists(b.map(v - _).toSet)
	}
	
	def sumInRange(nums: Array[Int], queries: Array[Array[Int]]): Int = {
		var sum = 0
		
		for (i <- queries.indices) {
			for (j <- queries(i)(0) to queries(i)(1)) {
				sum += nums(j)
			}
		}
		
		Math.floorMod(sum, math.pow(10, 9).toInt + 7)
	}
	
	def arrayMaxConsecutiveSum2(inputArray: Array[Int]): Int = {
	
	}
	
}
