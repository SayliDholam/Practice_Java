//h.w. : wap to find if a number is even or odd - using different approach of 0 and 1 wala ending 

import java.util.Scanner;

class Hw_1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Convert the number to string
        String numStr = Integer.toString(number);
        
        // Get the last character
        char lastChar = numStr.charAt(numStr.length() - 1);
        
        // Check if the last character is even or odd
        if (lastChar == '0' || lastChar == '2' || lastChar == '4' || lastChar == '6' || lastChar == '8') 
        {
            System.out.println("The number is even.");
        } 
        else 
        {
            System.out.println("The number is odd.");
        }
        scanner.close();
    }
}
