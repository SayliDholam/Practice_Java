//WAP to accept any character from the keyboard and check that entered character is in upper, lower, digit or special character using ASCII code

import java.util.Scanner;

class Q7_ascii
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);

      
        if (Character.isUpperCase(inputChar)) 
        {
            System.out.println("The entered character '" + inputChar + "' is an Uppercase Letter.");
        } 
        else if (Character.isLowerCase(inputChar)) 
        {
            System.out.println("The entered character '" + inputChar + "' is a Lowercase Letter.");
        } 
        else if (Character.isDigit(inputChar)) 
        {
            System.out.println("The entered character '" + inputChar + "' is a Digit.");
        } else 
        {
            System.out.println("The entered character '" + inputChar + "' is a Special Character.");
        }
	}
}
