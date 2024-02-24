//WAP to Check alphabet is vowel or consonant

import java.util.Scanner;

public class Q18_Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alp = sc.nextLine().charAt(0);

        if(alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' || alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U') 
        {
            System.out.print("It's a vowel.");
        } 
        else 
        {
            System.out.print("It's a consonant.");
        }
    }
}
