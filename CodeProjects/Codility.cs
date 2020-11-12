using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace CodeProjects
{
	class Codility
	{
		class Solution
		{
			public int solution1(int[] A)
			{
				return A.Where(e => e % 4 == 0).Sum();
			}

			public string solution2(int N, int K)
			{
				char[] aux = new char[N / 2];
				char[] letters = "abcdefghijklmnopqrstuvwxyz".ToCharArray();
				int i;

				for (i = 0; i < N / 2; i++)
				{
					aux[i] = letters[i % K];
				}

				string result = "";

				if (N % 2 != 0)
				{
					result = new string(aux) + "a";
				}
				else
				{
					result = new string(aux);
				}

				result += new string(aux.Reverse().ToArray());

				return result;
			}

			public bool solution3(string S)
			{
				S.SkipWhile(c => c == 'a');
				return false;
			}
		}
	}
}
