class factorial_while{
	public static void main(String[] args) {

		int no, fact = 1;

		System.out.println("Enter number : ");
		no = new java.util.Scanner(System.in).nextInt();

		while(no > 0)
		{
			fact = fact * no;
			--no;
		}
		System.out.println("Factorial is " + fact);
		
	}
}