class SumOf2Digits{
	public static void main(String args[]){

		int digit = 16;
		System.out.println(digit);

		int n1 = digit % 10;
		int n2 = digit / 10;

		int res = n1 + n2;

		System.out.println("Sum of " + digit + " is " + res);


	}
}