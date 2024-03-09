class Armstrong_Sum3 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers upto 1000 are : ");

        double sum1 = 0; // Declare and initialize sum1 outside the loop

        for (int i = 0; i <= 1000; i++) {
            int num = i;
            int count = 0;
            double sum = 0;
            int temp = num;

            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            temp = num;

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + Math.pow(rem, count);
                temp = temp / 10;
            }

            if (num == sum && count == 3) {
                System.out.println(num);
                sum1 = sum1 + sum;
            }
        }

        System.out.println("Sum of 3 digits armstrong is : " + sum1);
    }
}

