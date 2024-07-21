//string is a palindrome or not:
//logic : left to right = right to left


import java.util.*;

class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sc.nextLine();

		System.out.print("Is it a Palindrome ? : ");
		System.out.println(isPalin(input));	
	}

	static boolean isPalin(String str)
	{
		if(str == null || str.length() == 0)
		{
			return true;
		}

		str = str.toLowerCase();
		for(int i = 0 ; i <= str.length()/2; i++)
		{
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);

			if(start != end)
			{
				return false;
			}
		}
		return true;
	}
}