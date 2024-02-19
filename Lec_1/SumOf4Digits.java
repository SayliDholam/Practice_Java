class SumOf4Digits
{
	public static void main(String args[])
	{
		int digit = 6873;
		int digitx = 6873;
		System.out.println(digitx);

		int n1 = digit % 10;
		digit = digit / 10;

		int n2 = digit % 10;
		digit = digit / 10;

		int n3 = digit % 10;
		digit = digit / 10;

		int n4 = digit % 10;
		digit = digit / 10; 

		int res = n1 + n2 + n3 + n4;
		System.out.println("Sum of " + digitx + " is " + res);

	}
}