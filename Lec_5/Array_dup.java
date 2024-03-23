import java.util.*;

class Array_dup
{
	public static void main(String[] args) {

		String[] sarr = {"sayli", "aditi", "renu" , "ayush", "jay", "aditi", "anjali", "vedant"};

		for (int i = 0;i < sarr.length ; i++) 
		{
			for (int j = i+1; j < sarr.length ; j++) 
			{
				if((sarr[i].equals(sarr[j])) && (i != j))
				{
					System.out.println("Duplicate string is : " + sarr[i]);
				}	
			}	
		}
	}
}
