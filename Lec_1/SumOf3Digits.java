class SumOf3Digits
{
	public static void main(String args[]){

		int digit = 176;
		System.out.println(digit);

		int n1 = digit % 10;
		digit = digit / 10;

		int n2 = digit % 10;
		digit = digit / 10;

		int n3 = digit % 10;

		int res = n1 + n2 + n3;

		System.out.println("Sum of " + digit + " is " + res);



	}
}