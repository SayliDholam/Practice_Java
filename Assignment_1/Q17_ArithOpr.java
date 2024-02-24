import java.util.Scanner;

public class Q17_ArithOpr 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter an arithmetic operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) 
        {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) 
                {
                    System.out.println("Division: " + (num1 / num2));
                } 
                else 
                {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation ");
        }
    }
}
