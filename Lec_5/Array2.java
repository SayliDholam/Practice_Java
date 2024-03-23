import java.util.Scanner;

class Array2
{
	public static void main(String[] args) {

		int arr[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements : ");

		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++ ) {
				arr[i][j] = sc.nextInt();
				
			}
		}

		System.out.println("\n\nArray elements : ");

		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++ ) {
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
	}
}

