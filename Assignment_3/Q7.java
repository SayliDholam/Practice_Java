/*
pattern :
    J J J J J J J J J J
    I I I I I I I I I
    H H H H H H H H
    G G G G G G G
    F F F F F F
    E E E E E
    D D D D
    C C C
    B B
    A

*/
class Q7
{
	public static void main(String[] args) 
	{
		int i, j, n = 74;
		for (i = 10; i>=1 ;i--) 
		{
			for (j = i; j>=1; j--) 
			{
				System.out.print( (char)n + " ");
			}
			n--;
			System.out.println();	
		}
	}
}
