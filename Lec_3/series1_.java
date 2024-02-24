import java.util.Scanner;

class series1_{
	public static void main(String[] args) {

		int sum = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number  : ");
		int x = sc.nextInt();
		System.out.println("Enter stopping range : ");
		int n = sc.nextInt();

		System.out.println("Series is  : ");
		for(int i = 1; i <= n; i++){
			sum += (Math.pow(x, i))/i;
		}
		System.out.println("Sum of Series is  : " + sum);

	}
}