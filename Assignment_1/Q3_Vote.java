//WAP to Check voting eligibility

import java.util.Scanner;

class Q3_Vote{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age in years : ");
		int age = sc.nextInt();

		if(age >= 18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("Sorry, You are ineligible to vote");
		}
	}
}
