//find product of given digits 

import java.util.*;

class Digitproduct
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = prod(num);
        System.out.println("Product of the digits of " + num + " is: " + result);
    }

    // Logic
    static int prod(int n) 
    {
        if (n%10 == n) 
        {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
