//WAP to Check if number is even or odd

import java.util.Scanner;

class Q4_EvenOdd{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if(n % 2 == 0)
		{
			System.out.println(n + " is an even number");
		}
		else
		{
			System.out.println(n + " is an odd number");
		}
	}
}
