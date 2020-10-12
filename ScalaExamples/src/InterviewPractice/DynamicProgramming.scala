package InterviewPractice

class DynamicProgramming {
	
	def climbingStairs(n: Int): Int = {
		if (n > 2) {
			climbingStairs(n - 1) + climbingStairs(n - 2)
		} else {
			n
		}
	}
	
	def houseRobber(nums: Array[Int]): Int = {
		var a = 0
		var b = 0
		
		for (n <- nums) {
			val tmp = b + n
			b = Math.max(a, b)
			a = tmp
		}
		
		Math.max(a, b)
	}
	
}
