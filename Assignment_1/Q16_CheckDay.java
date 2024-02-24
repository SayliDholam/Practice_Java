//WAP to check weekend or holiday, Read a day from user

import java.util.Scanner;

public class Q16_CheckDay{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = sc.nextLine();

        if(day.equals("sunday"))
        {
            System.out.print("A holiday ");
        }
        else
        {
            System.out.print("A weekday ");
        }  
    }
}
