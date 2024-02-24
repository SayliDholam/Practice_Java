class sumeven_for{
	public static void main(String[] args) {

		int no, sum = 0;

		System.out.println("Enter number : ");
		no = new java.util.Scanner(System.in).nextInt();

		for(int i = 1; i <= no; i++)
		if(i % 2 == 0){
			sum = sum + i;
		}
		System.out.println("Sum of even numbers till " + no + " is " + sum);
	}
}