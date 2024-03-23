import java.util.Scanner;

class Array_smlr
{
	public static void main(String[] args) {

		int arr[] = new int[5];
		int large, small;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements : ");

		for(int i = 0; i < 5; i++){
			arr[i] = sc.nextInt();
		}

		small = large = arr[0];

		for(int i = 0; i < arr.length; i++){
			if(small > arr[i])
			{
				small = arr[i];
			}
			if(large < arr[i])
			{
				large = arr[i];
			}
		}

		System.out.println("Smallest element : " + small);
		System.out.println("Largest element : " + large);
	}
}

