//WAP to Calculate sum of Fibonacci series

import java.util.Scanner;

public class Q2_Fibonacci_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f0 = 0, f1 = 1, f2, n, sum = 0;

        System.out.println("Enter the number range: ");
        n = new java.util.Scanner(System.in).nextInt();

        System.out.println("Fibonacci series is: ");
        System.out.print(f0 + "\t" + f1);

        sum = f0 + f1;

        for (int i = 3; i <= n; i++) {
            f2 = f0 + f1;
            System.out.print("\t" + f2);

            sum += f2;

            f0 = f1;
            f1 = f2;
        }

        System.out.println("\nSum of Fibonacci series: " + sum);
    }
}
