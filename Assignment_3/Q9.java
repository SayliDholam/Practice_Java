/*
pattern :
           1
          2 2
         3 3 3
        4 4 4 4
       5 5 5 5 5
      6 6 6 6 6 6
     7 7 7 7 7 7 7
    8 8 8 8 8 8 8 8

*/

class Q9
{
	public static void main(String[] args) 
	{
		int i, j, k;
		for (i = 1; i <= 8 ; i++) 
		{
			for (k = i; k <= 8; k++) 
			{
				System.out.print(" ");
				
			}
			for (j = 1; j <= i; j++ ) 
			{
				System.out.print(i + " ");
				
			}
			System.out.println();	
		}
	}
}
