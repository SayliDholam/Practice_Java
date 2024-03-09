/*pattern10
1       2       3       4
5       6       7       8
9       10      11      12
13      14      15      16
sum of left diagonal
34
*/
class P10{
	public static void main(String[] args) {
		int i, j, n=1, sum = 0;
		for (i = 1; i<= 4 ;i++ ) {
			for (j = 1; j <= 4; j++ ) {
				System.out.print(n + "\t");
				if(i == j)
			{
				sum = sum + n;
			}
				n++;
			}
			System.out.println();
			
		}
		System.out.println("sum of left diagonal");
		System.out.println(sum);
	}
}