import java.util.Scanner;

class multiply_{
	public static void main(String[] args) {

		int mul = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int b = sc.nextInt();

		for (int i = 1; i<=b; i++) {
			mul = mul + a;		
		}
		System.out.println("Multiplication is "+ mul);
	}
}