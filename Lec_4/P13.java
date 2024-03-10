/*
A       A       A       A
B       B       B       B
C       C       C       C
D       D       D       D
*/

class P13
{
	public static void main(String[] args) 
	{
		int i, j, n=65;
		for (i = 1; i<= 4 ;i++ ) 
		{
			for (j = 1; j <= 4; j++ ) 
			{
				System.out.print((char)n + "\t");
			
			}
			n++;
			System.out.println();	
		}
	}
	
}
