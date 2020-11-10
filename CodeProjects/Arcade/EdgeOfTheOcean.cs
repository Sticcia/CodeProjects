using System;
using System.Linq;

namespace CodeProjects.Arcade
{
	class EdgeOfTheOcean
	{
		int adjacentElementsProduct(int[] inputArray)
		{
			int result = int.MinValue;
			int aux;

			for (int i = 0; i < inputArray.Length - 1; i++)
			{
				aux = inputArray[i] * inputArray[i + 1];
				if (aux > result)
				{
					result = aux;
				}
			}

			return result;
		}

		int shapeArea(int n)
		{
			int result = 1;

			for (int i = 0; i < n; i++)
			{
				result += i * 4;
			}

			return result;
		}

		int makeArrayConsecutive2(int[] statues)
		{
			int result = 0;
			int aux;
			int[] sortedStatues = statues.OrderBy(i => i).ToArray();

			for (int i = 1; i < sortedStatues.Length; i++)
			{
				aux = sortedStatues[i] - 1;
				while (sortedStatues[i - 1] != aux)
				{
					result++;
					aux--;
				}
			}

			return result;
		}

		bool almostIncreasingSequence(int[] sequence)
		{
			bool removedOne = false;
			int i = 0;

			while (i < sequence.Length - 1)
			{
				if (sequence[i] + 1 != sequence[i + 1])
				{
					if (!removedOne && i < sequence.Length - 2 && sequence[i] + 2 == sequence[i + 2])
					{
						i++;
					}
					else
					{
						return false;
					}
				}

				i++;
			}

			return true;
		}
	}
}
