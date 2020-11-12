using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CodeProjects.Arcade
{
	class DarkWilderness
	{
		int growingPlant(int upSpeed, int downSpeed, int desiredHeight)
		{
			var height = upSpeed;
			var days = 1;

			while (height < desiredHeight)
			{
				height += upSpeed - downSpeed;
				days++;
			}

			return days;
		}

		int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW)
		{
			var result = 0;

			if (weight1 + weight2 <= maxW)
			{
				return value1 + value2;
			}

			if (weight1 <= maxW)
			{
				result = value1;
			}

			if (weight2 <= maxW && value2 > result)
			{
				result = value2;
			}

			return result;
		}

		string longestDigitsPrefix(string inputString)
		{
			return string.Join("", inputString.TakeWhile(char.IsDigit));
		}

		int digitDegree(int n)
		{
			var count = 0;

			while (n > 9)
			{
				n = n.ToString().Sum(c => c - '0');
				count++;
			}

			return count;
		}

		bool bishopAndPawn(string bishop, string pawn)
		{
			return Math.Abs(bishop[0] - pawn[0]) == Math.Abs(bishop[1] - pawn[1]);
		}
	}
}
