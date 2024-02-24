/*
WAP to accept 5 paper marks from user and find total marks & percentage and check 
if percentage greater than 60 and gender is male then
print msg: you are eligible for admission.
check if percentage greater than 80 and gender is female then
print msg: you are eligible for admission.
*/

import java.util.Scanner;

public class Q22_Adm
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 papers:");

        int totalMarks = 0;

        for (int i = 1; i <= 5; i++) 
        {
            System.out.print("Enter marks for paper " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) ((totalMarks *100)/200);

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        if ((percentage > 60 && gender.equals("male")) || (percentage > 80 && gender.equals("female"))) 
        {
            System.out.println("Congratulations! You are eligible for admission.");
        } 
        else 
        {
            System.out.println("Sorry, you are not eligible for admission.");
        }
    }
}
