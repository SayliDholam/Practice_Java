/*
pattern :

    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1
    10 9 8 7 6 5 4 3 2 1

*/
class Q4
{
	public static void main(String[] args) 
	{
		int i, j;
		for (i = 10; i >= 1 ; i--) 
		{
			for (j = 10; j >= 1; j-- ) 
			{
				System.out.print(j + "\t");	
			}
			System.out.println();	
		}
	}
	
}
