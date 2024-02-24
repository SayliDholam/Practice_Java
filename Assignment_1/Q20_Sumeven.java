//WAP to perform Sum of first n even numbers

import java.util.Scanner;

public class Q20_Sumeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            int evenNumber = 2 * i;
            sum += evenNumber;
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }
}
