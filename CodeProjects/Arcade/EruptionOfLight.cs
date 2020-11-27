using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace CodeProjects.Arcade
{
	class EruptionOfLight
	{
		bool isBeautifulString(string inputString)
		{
			char[] letters = "abcdefghijklmnopqrstuvwxyz".ToCharArray();
			int count = Int32.MaxValue;

			foreach (char c in letters)
			{
				int aux = inputString.Count(e => e == c);

				if (aux > count)
				{
					return false;
				}

				count = aux;
			}

			return true;
		}

		string findEmailDomain(string address)
		{
			return address.Split('@').Last();
		}

		string buildPalindrome(string st)
		{
			int len = st.Length;
			int i = 0;

			while (st != string.Concat(st.Reverse()))
			{
				st = st.Insert(len, st[i++].ToString());
			}

			return st;
		}

		int electionsWinners(int[] votes, int k)
		{
			int m = votes.Max();
			if (votes.Count(x => x == m) == 1 && k == 0)
				return 1;
			else
				return votes.Count(x => x + k > m);
		}

		bool isMAC48Address(string inputString)
		{
			Regex rgx = new Regex(@"^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
			return rgx.IsMatch(inputString);
		}
	}
}
