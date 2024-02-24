//3 digit armstrong 

import java.util.Scanner;
class armstrong_dowhile{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int no, rem, sum = 0;

		System.out.println("Enter number : ");
		no = sc.nextInt();
		int nsave = no;

		while(no > 0)
		{
			rem = no %10;
			sum = sum +(rem * rem * rem);
			no = no / 10;
		}
		if(nsave == sum)
		{
			System.out.println("It is a armstrong number of 3 digit");
		}
		else
		{
			System.out.println("It is not a armstrong number of 3 digit ");
		}
	}
}