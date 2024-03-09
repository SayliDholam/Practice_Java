/*pattern11
 1       2       3       4
sum of left diagonal 10

5       6       7       8
sum of left diagonal 26

9       10      11      12
sum of left diagonal 42

13      14      15      16
sum of left diagonal 58
*/
class P11{
	public static void main(String[] args) {
		int i, j, n=1, sum = 0;
		for (i = 1; i<= 4 ;i++ ) {
			for (j = 1; j <= 4; j++ ) {
				System.out.print(n + "\t");
				sum = sum + n;
				n++;
			}
			System.out.println();
			System.out.println("sum of left diagonal " + sum + "\n");
			sum = 0;
			
		}
		
	}
}