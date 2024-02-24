import java.util.Scanner;

class armstrong_any{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int no, rem, count = 0;
		double sum = 0;

		System.out.println("Enter number : ");
		no = sc.nextInt();
		int nsave = no;
		int temp = no;

		while(temp > 0)
		{
			temp = temp / 10;
			count++;
		}
		System.out.println("Count of digits is " + count);

		while(no > 0)
		{
			rem = no %10;
			sum = sum +(Math.pow(rem, count));
			no = no / 10;
		}
		if(nsave == sum)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}

	}
}