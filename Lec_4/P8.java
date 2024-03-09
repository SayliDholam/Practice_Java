/*pattern8
  ****
   ***
    **
     *
*/
class P8{
	public static void main(String[] args) {
		int i, j, k, sp = 2 ;
		for (i = 4; i>=1 ; i--) {
			for (k = 1; k<=sp; k++) {
				System.out.print(" ");
			}
			for (j = 1; j<=i ; j++ ) {
				System.out.print("*");
				
			}
			System.out.println();
			sp++;
			
		}
	}
}