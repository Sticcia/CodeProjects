using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CodeProjects.Arcade
{
	class DivingDeeper
	{
		int[] extractEachKth(int[] inputArray, int k)
		{
			int[] result = new int[inputArray.Length - inputArray.Length / k]; ;
			var j = 0;

			for (int i = 1; i < inputArray.Length + 1; i++)
			{
				if (i % k != 0)
				{
					result[j] = inputArray[i - 1];
					j++;
				}
			}

			return result;

			/*
			 * return inputArray.Where((e, i) => (i + 1) % k != 0).ToArray();
			 */
		}

		char firstDigit(string inputString)
		{
			return inputString.First(e => char.IsDigit(e));
		}

		int differentSymbolsNaive(string s)
		{
			return s.Distinct().Count();
		}

		int arrayMaxConsecutiveSum(int[] inputArray, int k)
		{
			var max = 0;

			for (int i = 0; i < inputArray.Length - k; i++)
			{
				var aux = inputArray.Skip(i).Take(k).Sum();
				if (aux > max)
				{
					max = aux;
				}
			}

			return max;

			/*
			 * int sum = inputArray.Take(k).Sum();
			 * return Enumerable.Range(k, inputArray.Length - k).Max(r => Math.Max(sum, sum = (sum + inputArray[r] - inputArray[r - k])));
			 */
		}
	}
}
