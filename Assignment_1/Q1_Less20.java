//WAP to Check number is less than 20

import java.util.Scanner;

class Q1_Less20{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if(n < 20){
			System.out.println(n + " is less than 20");
		}
		else{
			System.out.println(n + " is equal to or greater than 20");
		}
	}
}
