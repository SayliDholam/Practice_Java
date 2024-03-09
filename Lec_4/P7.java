/*pattern7
A       B       C       D
E       F       G       H
I       J       K       L
M       N       O       P
*/
class P7{
	public static void main(String[] args) {
		int i, j, n=65;
		for (i = 1; i<= 4 ;i++ ) {
			for (j = 1; j <= 4; j++ ) {
				System.out.print((char)n + "\t");
				n++;
			}
			System.out.println();
			
		}
	}
}