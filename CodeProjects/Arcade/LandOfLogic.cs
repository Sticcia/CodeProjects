using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace CodeProjects.Arcade
{
	class LandOfLogic
	{
		string longestWord(string text)
		{
			var word = new Regex("[^a-zA-Z]").Replace(text, " ");
			return word.Split(" ").OrderByDescending(s => s.Length).First();
		}

		bool validTime(string time)
		{
			return new Regex("^([01]?[0-9]|2[0-3]):[0-5][0-9]").IsMatch(time);
		}

		int sumUpNumbers(string inputString)
		{
			return new Regex("[0-9]+").Matches(inputString).Sum(item => int.Parse(item.Value));
		}

		int differentSquares(int[][] matrix)
		{
			List<int[]> result = new List<int[]>();

			for (int i = 0; i < matrix.Length - 1; i++)
			{
				for (int j = 0; j < matrix[i].Length - 1; j++)
				{
					int[] aux = new int[] {matrix[i][j], matrix[i][j + 1], matrix[i + 1][j], matrix[i + 1][j + 1]};

					if (!result.Any(e => e.SequenceEqual(aux)))
					{
						result.Add(aux);
					}
				}
			}

			return result.Count;
		}

		int digitsProduct(int product)
		{
			List<int> aux = new List<int>();
			int result = 0;

			if (product == 0)
			{
				return 10;
			}

			if (product == 1)
			{
				return 1;
			}

			for (int i = 9; i > 1; i--)
			{
				while (product % i == 0)
				{
					product /= i;
					aux.Add(i);
				}
			}

			if (product > 1)
			{
				return -1;
			}

			for (int j = aux.Count - 1; j >= 0; j--)
			{
				result = 10 * result + aux[j];
			}

			return result;
		}

		string[] fileNaming(string[] names)
		{
			List<string> result = new List<string>();

			foreach (string name in names)
			{
				string aux = name;
				int i = 1;
				while (result.Contains(aux))
				{
					aux = name + "(" + i + ")";
					i++;
				}
				result.Add(aux);
			}

			return result.ToArray();
		}

		string messageFromBinaryCode(string code)
		{
			string result = "";

			for (int i = 0; i < code.Length; i += 8)
			{
				result += Convert.ToChar(Convert.ToInt32(new string(code.Skip(i).Take(8).ToArray()), 2));
			}

			return result;
		}

		int[][] spiralNumbers(int n)
		{
			int[][] result = new int[n][];

			for (int i = 0; i < n; i++)
			{
				result[i] = new int[n];
			}

			int count = 1, index = 0;

			for (; n > 0; n -= 2)
			{
				for (int a = 0; a < n; a++)
				{
					result[index][a + index] = count++;
				}

				for (int b = index + 1; b < n + index; b++)
				{
					result[b][n - 1 + index] = count++;
				}

				for (int c = n - 2 + index; c >= index; c--)
				{
					result[n - 1 + index][c] = count++;
				}

				for (int d = n - 2 + index; d > index; d--)
				{
					result[d][index] = count++;
				}

				index++;
			}

			return result;
		}

		bool sudoku(int[][] grid)
		{
			List<int> row = new List<int>();
			List<int> col = new List<int>();
			List<int> group = new List<int>();

			for (int i = 0; i < grid.Length; i++)
			{
				for (int j = 0; j < grid[i].Length; j++)
				{
					if (i % 3 == 0 && j % 3 == 0)
					{
						foreach (var item in grid.Skip(i).Take(3))
						{
							group.AddRange(item.Skip(j).Take(3));
						}

						if (group.Distinct().Count() != 9)
						{
							return false;
						}

						group.Clear();
					}

					row.Add(grid[i][j]);
					col.Add(grid[j][i]);
				}

				if (row.Distinct().Count() != 9 || col.Distinct().Count() != 9)
				{
					return false;
				}

				row.Clear();
				col.Clear();
			}

			return true;
		}
	}
}
