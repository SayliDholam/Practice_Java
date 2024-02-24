//WAP to Check if student scored distinction

import java.util.Scanner;

class Q13_distinction{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
 

        if (marks >= 75) 
        {
            System.out.println("Yous scored a distinction.");
        } 
        else 
        {
            System.out.println("Sorry, you did not score a distinction.");
        }

	}
}