import java.util.Scanner;

class power_{
	public static void main(String[] args) {

		int mul = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int b = sc.nextInt();

		for (int i = 1; i<=b; i++) {
			mul = mul * a;		
		}
		System.out.println(a +  " raise to "+ b  +" is "+ mul);
	}
}