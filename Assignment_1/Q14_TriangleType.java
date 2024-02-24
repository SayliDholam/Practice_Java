//WAP to Check type of triangle

import java.util.Scanner;

public class Q14_TriangleType 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

      
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) 
        {
            if (side1 == side2 && side2 == side3) 
            {
                System.out.println("It is an Equilateral Triangle.");
            } 
            else if (side1 == side2 || side2 == side3 || side1 == side3) 
            {
                System.out.println("It is an Isosceles Triangle.");
            } 
            else 
            {
                System.out.println("It is a Scalene Triangle.");
            }
        } 
        else 
        {
            System.out.println("It does not form a valid triangle.");
        }
    }
}
