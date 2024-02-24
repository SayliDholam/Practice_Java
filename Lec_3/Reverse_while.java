class Reverse_while{
	public static void main(String[] args) {

		int no, rem, rev = 0;

		System.out.println("Enter number : ");
		no = new java.util.Scanner(System.in).nextInt();

		while(no > 0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reverse is " + rev);
		
	}
}