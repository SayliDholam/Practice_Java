//WAP to Check number is positive, -negative or zero

import java.util.Scanner;

class Q8_number
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0)
        {
            System.out.print("Number is positive");

        }
        else if(n < 0)
        {
            System.out.print("Number is negative");
        }
        else
        {
            System.out.print("Number is zero");
        }
        
	}
}
