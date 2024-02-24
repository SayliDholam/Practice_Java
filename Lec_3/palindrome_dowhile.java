import java.util.Scanner;

class palindrome_dowhile{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int no, rem, rev = 0;

		System.out.println("Enter number : ");
		no = sc.nextInt();
		int nsave = no;

		while(no > 0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		if(nsave == rev)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome ");
		}
	}
}