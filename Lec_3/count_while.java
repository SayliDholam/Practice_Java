class count_while{
	public static void main(String[] args) {

		int no, rem, count = 0;

		System.out.println("Enter number : ");
		no = new java.util.Scanner(System.in).nextInt();

		while(no > 0)
		{
			no = no / 10;
			count++;
		}
		System.out.println("Count of digits is " + count);
		
	}
}