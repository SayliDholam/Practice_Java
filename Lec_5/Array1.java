import java.util.Scanner;

class Array1
{
	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements : ");

		for(int i = 0; i < 5; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements : ");

		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}

	}
}