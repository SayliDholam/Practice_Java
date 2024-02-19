class Reverse_4Digit{
	public static void main(String args[]){

		int digit = 5862;
		int digitx = 5862;

		System.out.println(digitx);

		int n1 = digit % 10;
		digit = digit / 10;

		int n2 = digit % 10;
		digit = digit / 10;

		int n3 = digit % 10;
		digit = digit / 10;

		int n4 = digit % 10;
		digit = digit / 10; 

		int res = n1*1000 + n2*100 + n3*10 + n4;
		System.out.println("Sum of " + digitx + " is " + res);

	}
}