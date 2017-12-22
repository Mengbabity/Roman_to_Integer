# Roman_to_Integer
#include<iostream>
#include<map>
using namespace std;

class Solution {
public:
	int romanToInt(string s) 
	{
		if (s == "")
		{
			return 0;
		}
		map<char, int> R = { { 'I', 1 },
		{ 'X', 10 },
		{ 'C', 100 },
		{ 'M', 1000 },
		{ 'V', 5 },
		{ 'L', 50 },
		{ 'D', 500 } };

		int sum = R[s.back()];   //get the last

		for (int i = s.length() - 1; i > 0; i--)
		{
			if (R[s[i - 1]] < R[s[i]])
			{
				sum = sum - R[s[i-1]];
			}
			else
			{
				sum = sum + R[s[i-1]];
			}
		}
		cout << sum << endl;
		return sum;

	}
};

void main()
{
	Solution s;
	s.romanToInt("MDXI");
}
