import java.util.Scanner;

class series2_{
	public static void main(String[] args) {

		int sum = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number  : ");
		int x = sc.nextInt();
		System.out.println("Enter stopping range : ");
		int n = sc.nextInt();

		for(int i = 1; i<=n; ++i){
			int no = i;
			int fact = 1;

			while(no > 0){
				fact = fact * no;
				--no;
			}
			sum += (Math.pow(x, i))/fact;
		}
		System.out.println("Sum of Series is  : " + sum);

	}
}