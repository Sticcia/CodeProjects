using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CodeProjects
{
	class Practice2
	{
		int[][] meanGroups(int[][] a)
		{
			List<long> means = new List<long>();
			List<List<int>> b = new List<List<int>>();

			for (int i = 0; i < a.Length; i++)
			{
				//calculate mean
				int mean = 0;
				for (int j = 0; j < a[i].Length; j++)
				{
					mean += a[i][j];
				}
				mean /= a[i].Length;

				if (!means.Contains(mean))
				{
					means.Add(mean);
					b.Add(new List<int> { i });
				}
				else
				{
					int index = means.FindIndex(m => m == mean);
					b.Find(l => l.Contains(index)).Add(i);
				}
			}

			return b.Select(a => a.ToArray()).ToArray();
		}

		long hashMap(string[] queryType, int[][] query)
		{
			List<int> keys = new List<int>();
			List<int> values = new List<int>();
			long sum = 0;
			int count = 0;

			foreach (string type in queryType)
			{
				switch (type)
				{
					case "insert":
						keys.Add(query[count][0]);
						values.Add(query[count][1]);
						break;
					case "get":
						sum += values[keys.FindIndex(k => k == query[count][0])];
						break;
					case "addToKey":
						for (int i = 0; i < keys.Count; i++)
						{
							keys[i] += query[count][0];
						}
						break;
					case "addToValue":
						for (int i = 0; i < values.Count; i++)
						{
							values[i] += query[count][0];
						}
						break;
					default:
						return 0;
				}

				count++;
			}

			return sum;
		}

		bool alternatingSort(int[] a)
		{
			int[] b = new int[a.Length];
			int x = 0;
			int y = a.Length - 1;

			for (int i = 0; i < a.Length; i++)
			{
				if (i % 2 == 0)
				{
					b[i] = a[x];
					x++;
				}
				else
				{
					b[i] = a[y];
					y--;
				}

				if (i > 0 && b[i] <= b[i - 1])
				{
					return false;
				}
			}

			return true;
		}
	}
}
