import java.util.Scanner;

class armstrong_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Armstrong numbers up to 1000 are:");

        for (int i = 1; i <= 1000; i++) {
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

        sc.close();
    }
}
