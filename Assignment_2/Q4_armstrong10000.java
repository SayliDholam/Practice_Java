//Print all armstrong numbers from 1 to 10000

public class Q4_armstrong10000 
{
    public static void main(String[] args) {
   
        System.out.println("Armstrong numbers up to 10000 are:");

        for (int i = 1; i <= 10000; i++) {
            int num = i;
            int count = 0;
            double sum = 0;
            int temp = num;

            // Count the number of digits
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            temp = num;

            // Calculate the sum of nth power of digits
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + Math.pow(rem, count);
                temp = temp / 10;
            }

            if (num == sum) {
                System.out.println(num);
            }
        }

    }
}
