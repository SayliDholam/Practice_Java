/*
pattern
               1
              1 2
            1 2 3
           1 2 3 4
         1 2 3 4 5
        1 2 3 4 5 6
       1 2 3 4 5 6 7
      1 2 3 4 5 6 7 8
     1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7 8 9 10

*/
class Q10
{
	public static void main(String[] args) 
	{
		int i, j, k;
		for (i = 1; i <=10;i++) 
		{
			for (k = i; k <= 10; k++) 
			{
				System.out.print(" ");	
			}
			for (j = 1; j<=i; j++ ) 
			{

				System.out.print(j + " ");
			}
			System.out.println();		
		}
	}
}
