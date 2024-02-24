//WAP to Check sum of digit greater than 10

import java.util.Scanner;

public class Q15_SumDigit10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        int sum = 0, num = no, rem;

        while (no > 0) {
            rem = no % 10;
            sum = sum + rem;
            no = no / 10;
        }

        if (sum > 10) 
        {
            System.out.println("The sum of digits of " + num + " is " + sum + " which is greater than 10.");
        } 
        else 
        {
            System.out.println("The sum of digits of " + num + " is " + sum + " is not greater than 10.");
        }
    }
}
