// WAP to Check number is even or odd

import java.util.Scanner;

class Q19_EvenOdd
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) 
        {
            System.out.print("Number is even");
        } 
        else 
        {
            System.out.print("Number is odd");
        }		
	}	
}

