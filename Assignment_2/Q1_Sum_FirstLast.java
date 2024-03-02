//WAP to print Sum of first & last digit of number

import java.util.Scanner;

public class Q1_Sum_FirstLast 
{
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int sum = 0;

        int lDigit = num % 10;
        sum = sum + lDigit;

        while (num != 0) {
            int curDigit = num % 10;
            num = num / 10;

            if (num == 0) {
                sum = sum + curDigit;
            }
        }
        System.out.println("Sum of first and last digits : " + sum);
    }

}
