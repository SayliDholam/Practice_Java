//linear search - strings


import java.util.*;

class linear2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String name = sc.nextLine();

		System.out.println("\nEnter a character to search : ");
		char target = sc.next().charAt(0);

		//function call
		System.out.println("\nDoes the character exists ? : ");
		System.out.println(lsearch2(name,target));	
	}


	//logic
	static boolean lsearch2(String s, char t)
	{
		if(s.length() == 0)
		{
			return false;
		}

		for(int i = 0 ; i < s.length(); i++)
		{
			if(t == s.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
}