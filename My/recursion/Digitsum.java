//find sum of given digits 

import java.util.*;

class Digitsum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = sum(num);
        System.out.println("Sum of the digits of " + num + " is: " + result);
    }

    // Logic
    static int sum(int n) 
    {
        if (n == 0) 
        {
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
