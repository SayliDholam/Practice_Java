//WAP for Largest amongst three numbers using nested if else

import java.util.Scanner;

class Q9_Largest3
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Enter 1st number : ");
        n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        n2 = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3)
        {
            System.out.println(n1 + " is greater than " + n2 + " and " + n3);
        }
        else if( n2 > n1 && n2 > n3)
        {
            System.out.println(n2 + " is greater than " + n1 + " and " + n3);
        }
        else if(n3 > n1 && n3 > n2)
        {
            System.out.println(n3 + " is greater than " + n1 + " and " + n2);
        }
        else{
             System.out.println("All 3 numbers are equal ");

        }
	}
}
