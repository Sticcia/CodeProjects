using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CodeProjects.Arcade
{
	class RainbowOfClarity
	{
		bool isDigit(char symbol)
		{
			return char.IsDigit(symbol);
		}

		string lineEncoding(string s)
		{
			string result = "";
			int count = 0;
			int curr = 0;

			while (curr < s.Length)
			{
				count = s.Skip(curr).TakeWhile(e => e == s[curr]).Count();
				if (count > 1)
				{
					result += count;
				}
				result += s[curr];
				curr += count;
			}

			return result;
		}

		int chessKnight(string cell)
		{
			int i = Math.Min(cell[0] + 2, 'h') - Math.Max(cell[0] - 2, 'a');
			int j = Math.Min(cell[1] + 2, '8') - Math.Max(cell[1] - 2, '1');
			return (i * j) / 2;
		}

		int deleteDigit(int n)
		{
			string value = n.ToString();
			int result = 0;

			foreach (var item in value)
			{
				var aux = int.Parse(value.Remove(value.IndexOf(item), 1));
				if (aux > result)
				{
					result = aux;
				}
				
			}

			return result;
		}
	}
}
