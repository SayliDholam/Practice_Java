/*
pattern : 
    J J J J J J J J J J
    I I I I I I I I I I
    H H H H H H H H H H
    G G G G G G G G G G
    F F F F F F F F F F
    E E E E E E E E E E
    D D D D D D D D D D
    C C C C C C C C C C
    B B B B B B B B B B
    A A A A A A A A A A

*/


class Q5
{
	public static void main(String[] args) 
	{
		int i , j, n=74;
		for (i = 10;i >= 1 ; i--) 
		{
			for (j = 1; j <= 10; j++) 
			{
				System.out.print((char)n + "\t");
			}
			n--;
			System.out.println();
		}
	}
}
