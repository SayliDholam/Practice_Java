class fibonacci_for{
	public static void main(String[] args) {

		int f0 = 0 , f1 = 1 , f2 , n;


		System.out.println("Enter number range : ");
		n = new java.util.Scanner(System.in).nextInt();

		System.out.println("Fibonnaci series is " );
		System.out.println(f0 + "\t" + f1);

		for(int i = 3; i <=n; i++){
			f2 = f0 + f1;
			System.out.println("\t " + f2);

			f0 = f1;
			f1 = f2;
		}
		
	}
}