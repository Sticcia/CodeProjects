package Arcade.TheCore

class AtTheCrossroads {

	def reachNextLevel(experience: Int, threshold: Int, reward: Int): Boolean = {
		(experience + reward) >= threshold
	}

	def knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int = {
		var result = 0

		if (weight1 + weight2 <= maxW) {
			return value1 + value2
		}

		if (weight1 <= maxW) {
			result = value1
		}

		if (weight2 <= maxW && value2 > result) {
			result = value2
		}

		result
	}

}

