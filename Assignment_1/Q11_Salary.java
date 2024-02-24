//WAP to accept basic salary 20000/- and daily allowance, traveling allowance, house rent and Print gross salary of employee

import java.util.Scanner;

class Q11_Salary
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary : ");
        int sal = sc.nextInt();
        System.out.println("Enter daily allowance : ");
        int dal = sc.nextInt();
        System.out.println("Enter travelling allowance : ");
        int tal = sc.nextInt();
        System.out.println("Enter house rent : ");
        int hrent = sc.nextInt();

        int gsal = sal + dal + tal + hrent;

        System.out.println("Gross salary is : " +  gsal);
	}
}
