//reverse a number


import java.util.*;

class Reverse 
{
    static int sum = 0;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        rev(num);
        System.out.println("Reverse of " + num + " is: " + sum);
    }


    // Logic
    static void rev(int n)
    {
        if (n == 0) 
        {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
    }
}
