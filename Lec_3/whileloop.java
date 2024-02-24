import java.util.Scanner;

class whileloop{
	public static void main(String[] args) {
		
		//print 10 times using while loop
		int i = 1;
		while( i<=10){
			System.out.println("sayli");
			++i;
		}

		Scanner sc = new Scanner(System.in);

		//sum of numbers
		System.out.println("Enter a number : ");
		int j = sc.nextInt();
		int rem, sum = 0;
		while( j>0){
			rem = j % 10;
			sum = sum + rem;
			j = j / 10;
		}
		System.out.println("Sum is : " + sum);

		//product numbers
		System.out.println("Enter a number : ");
		int k = sc.nextInt();
		int rem2, pr = 1;
		while( k>0){
			rem2 = k % 10;
			pr = pr * rem2;
			k = k / 10;
		}
		System.out.println("Product is :" + pr);
	}
}
