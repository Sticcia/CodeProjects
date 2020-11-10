using System;

namespace CodeProjects
{
	class TheJourneyBegins
	{
		int centuryFromYear(int year)
		{
			int result = year / 100;

			return year % 100 == 0 ? result : result + 1;
		}

		bool checkPalindrome(string inputString)
		{
			int j = inputString.Length;

			for (int i = 0; i < inputString.Length; i++)
			{
				j--;
				if (inputString[i] != inputString[j])
				{
					return false;
				}
			}

			return true;
		}
	}
}
