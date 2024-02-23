//WAP Enter three angles & check if it is a triangle

import java.util.Scanner;

public class Q5_CheckTriangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        
        if (angle1 + angle2 + angle3 == 180) 
        {
            System.out.println("It is a valid triangle.");
        } 
        else 
        {
            System.out.println("Sorry, it is an invalid triangle.");
        }
        scanner.close();
    }
}
