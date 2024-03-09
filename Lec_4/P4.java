/*pattern4
1       2       3       4
5       6       7       8
9       10      11      12
13      14      15      16
*/
class P4{
	public static void main(String[] args) {
		int i, j, n=1;
		for (i = 1; i<= 4 ;i++ ) {
			for (j = 1; j <= 4; j++ ) {
				System.out.print(n + "\t");
				n++;
			}
			System.out.println();
			
		}
	}
}