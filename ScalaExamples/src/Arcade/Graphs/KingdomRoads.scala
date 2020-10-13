package Arcade.Graphs

class KingdomRoads {
	
	def newRoadSystem(roadRegister: Array[Array[Boolean]]): Boolean = {
		for (i <- roadRegister.indices) {
			val a = roadRegister(i).count(_ == true)
			var b = 0
			
			for (j <- roadRegister.indices) {
				if (roadRegister(j)(i)) {
					b += 1
				}
			}
			
			if (a != b) {
				return false
			}
		}
		
		true
		
		// or
		//     roadRegister.indices.forall { i =>
		//      roadRegister(i).count(v => v) == roadRegister.count(v => v(i))
		//    }
	}
	
	def roadsBuilding(cities: Int, roads: Array[Array[Int]]): Array[Array[Int]] = {
		var count = (cities * (cities - 1)) / 2
		
		val matrix = Array.ofDim[Boolean](cities, cities)
		for (r <- roads) {
			matrix(r(0))(r(1)) = true
			matrix(r(1))(r(0)) = true
			count -= 1
		}
		
		val result = Array.ofDim[Int](count, 2)
		var index = 0
		
		for (i <- 0 until cities) {
			for (j <- i + 1 until cities) {
				if (!matrix(i)(j)) {
					result(index)(0) = i
					result(index)(1) = j
					index += 1
				}
			}
		}
		
		result
	}
	
	def efficientRoadNetwork(n: Int, roads: Array[Array[Int]]): Boolean = {
		for (i <- 0 until n) {
			for (j <- i + 1 until n) {
				if (!roads.exists(r => (r.contains(i) && r.contains(j))
					|| (r.contains(i) && roads.exists(e => e.contains(r((r.indexOf(i) + 1) % 2)) && e.contains(j))))) {
					return false
				}
			}
		}
		
		true
	}
	
	def financialCrisis(roadRegister: Array[Array[Boolean]]): Array[Array[Array[Boolean]]] = {
		val result = Array.ofDim[Boolean](roadRegister.length, roadRegister.length - 1, roadRegister.length - 1)
		
		for (i <- roadRegister.indices) {
			result(i) = roadRegister.indices.filterNot(_ == i).map(k =>
				roadRegister(k).indices.filterNot(_ == i).map(j =>
					roadRegister(k)(j)).toArray).toArray
		}
		
		result
	}
	
	def namingRoads(roads: Array[Array[Int]]): Boolean = {
		for (r <- roads) {
			if (!roads.filter(e => e(0) == r(0) || e(1) == r(0)).forall(e => e(2) != r(2) + 1 && e(2) != r(2) - 1)) {
				return false
			}
		}
		
		true
	}
	
}
