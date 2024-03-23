import java.util.Scanner;

class ArraySum
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
			sum = sum + arr[i];
		}
		System.out.println("Sum of the Array elements are : " + sum);

	}
}