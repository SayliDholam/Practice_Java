//Print all prime numbers from 1 to 5555

public class Q3_Prime 
{
    public static void main(String[] args) {
   
        int start = 1;
        int end = 5555;

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) 
        {
            boolean isPrime = true;
            if (i > 1) 
            {
                for (int j = 2; j <= i / 2; j++) 
                {
        
                    if (i % j == 0) 
                    {
                        isPrime = false;
                        break;  
                    }
                }
            } 
            else 
            {
        
                isPrime = false;
            }

            if (isPrime) 
            {
                System.out.print(i + " ");
            }
        }
    }
}
