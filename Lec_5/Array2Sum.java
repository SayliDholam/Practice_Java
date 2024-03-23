import java.util.Scanner;

class Array2Sum
{
	public static void main(String[] args) {

		int arr[][] = new int[3][3];

		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements : ");

		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++ ) {
				arr[i][j] = sc.nextInt();
				
			}
		}

		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++ ) {
				sum = sum + arr[i][j];
				
			}
			
		}
		System.out.println("Sum of elements is " + sum);
	}
}

