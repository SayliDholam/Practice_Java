import java.util.Scanner;

class ArraySumOdd
{
	public static void main(String[] args) {

		int arr[] = new int[5];
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements : ");

		for(int i = 0; i < 5; i++){
			arr[i] = sc.nextInt();
		}


		for(int i = 0; i < arr.length ; i++){
			if(arr[i] % 2 != 0 )
			{
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of the odd Array elements are : " + sum);

	}
}