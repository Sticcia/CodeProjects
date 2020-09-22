using System;
using System.Linq;

namespace CodeProjects
{
	class Practice1
	{
		int[] mutateArray(int n, int[] a)
		{
			int[] b = new int[n];

			for (int i = 0; i < n; i++)
			{
				b[i] = a[i];

				if (i - 1 >= 0)
				{
					b[i] += a[i - 1];
				}

				if (i + 1 < n)
				{
					b[i] += a[i + 1];
				}
			}

			return b;
		}

		int countTinyPairs(int[] a, int[] b, int k)
		{
			int j = b.Length;
			int x = 0;
			for (int i = 0; i < a.Length; i++)
			{
				j--;
				if (int.Parse(a[i].ToString() + b[j].ToString()) < k)
				{
					x++;
				}
			}
			return x;
		}

		string mergeStrings(string s1, string s2)
		{
			string result = "";
			int count1, count2;
			int i = 0, j = 0;

			while (i < s1.Length || j < s2.Length)
			{
				if (i == s1.Length)
				{
					result += s2.Substring(j);
					return result;
				}

				if (j == s2.Length)
				{
					result += s1.Substring(i);
					return result;
				}

				count1 = s1.Count(c => c == s1[i]);
				count2 = s2.Count(c => c == s2[j]);

				if (count1 < count2)
				{
					result += s1[i];
					i++;
				}
				else if (count2 < count1)
				{
					result += s2[j];
					j++;
				}
				else
				{
					if (s1[i] <= s2[j])
					{
						result += s1[i];
						i++;
					}
					else
					{
						result += s2[j];
						j++;
					}
				}
			}

			return result;
		}

		long concatenationsSum(int[] a)
		{
			long x = 0;

			foreach (var item1 in a)
			{
				foreach (var item2 in a)
				{
					if (item2 < 10)
						x += 10L * item1 + item2;
					else if (item2 < 100)
						x += 100L * item1 + item2;
					else if (item2 < 1000)
						x += 1000L * item1 + item2;
					else if (item2 < 10000)
						x += 10000L * item1 + item2;
					else if (item2 < 100000)
						x += 100000L * item1 + item2;
					else if (item2 < 1000000)
						x += 1000000L * item1 + item2;
					else if (item2 < 10000000)
						x += 10000000L * item1 + item2;
					else if (item2 < 100000000)
						x += 100000000L * item1 + item2;
				}
			}

			return x;
		}
	}
}
