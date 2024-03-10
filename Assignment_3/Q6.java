/*
pattern :
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A
    J I H G F E D C B A   
*/

class Q6{
	public static void main(String[] args) {
		int i, j  ;
		for (i = 1; i <= 10; i++ ) {
			for ( j = 10 ; j >= 1; j--) {
				System.out.print((char)('A' - 1 + j) + " ");
				
			}
			System.out.println();
			
		}

	}
}



/*

('A' - 1 + j): This expression calculates the ASCII value of the character to be printed in each iteration.

''A' is the starting character.
-1 is subtracted to adjust the position because we want to start from 'J' and go backwards.
+j is added to move through the characters in the reverse order.

*/