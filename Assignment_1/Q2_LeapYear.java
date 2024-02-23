//WAP to check entered year is a leap year or not using nested if else.

import java.util.Scanner;

public class Q2_LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    System.out.println(year + " is a centurian leap year.");
                } 
                else 
                {
                    System.out.println(year + " is a non-centurian leap year.");
                }
            } 
            else 
            {
                System.out.println(year + " is a normal leap year.");
            }
        } 
        else 
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
