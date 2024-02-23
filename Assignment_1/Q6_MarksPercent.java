//WAP to accept 5 paper marks from user and find total marks & percentage

import java.util.Scanner;

class Q6_MarksPercent
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter paper1 marks : ");
		int marks1 = sc.nextInt();

		System.out.println("Enter paper2 marks : ");
		int marks2 = sc.nextInt();

		System.out.println("Enter paper3 marks : ");
		int marks3 = sc.nextInt();

		System.out.println("Enter paper4 marks : ");
		int marks4 = sc.nextInt();

		System.out.println("Enter paper5 marks : ");
		int marks5 = sc.nextInt();

		int total = (marks1 + marks2 + marks3 + marks4 + marks5);
		int percent = ((total)*100)/500;

		System.out.println("\n");
		System.out.println("Subject marks are : ");
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(marks3);
		System.out.println(marks4);
		System.out.println(marks5);
		System.out.println("\nSubject total is : ");
		System.out.println(total);
		System.out.println("\nPercentage is : ");
		System.out.println(percent);
	}
}