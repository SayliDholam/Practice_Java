//Print all palindrome numbers from 1 to 9999

public class Q5_Palindrome9999
{
    public static void main(String[] args) {
   

		int rem, rev = 0;

        for (int i = 1; i <= 9999; i++) {
            int nsave = i;

            int temp = i;
            
            while (temp > 0) 
            {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if (nsave == rev) 
            {
                System.out.println(nsave + " is a palindrome");
            }
            
            rev = 0; 
        }
	} 
}
