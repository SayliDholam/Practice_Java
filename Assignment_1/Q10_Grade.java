//WAP to Print grade of students

import java.util.Scanner;

class Q10_Grade
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks : ");
        int marks = sc.nextInt();

        if( marks >= 90)
        {
            System.out.println("You obtained grade : A ");
        }
        else if( marks >= 70 && marks <=89)
        {
            System.out.println("You obtained grade : B ");
        }
        else if(marks >= 50 && marks <=69 )
        {
            System.out.println("You obtained grade :C ");
        }
        else if(marks >= 35 && marks <=50 )
        {
            System.out.println("You obtained grade : D ");
        }
        else
        {
            System.out.println("Sorry, you failed");
        }
	}
}
