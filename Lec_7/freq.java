//find frequency of unsorted array 
//hw - 2


import java.util.*;

class freq{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int[] ar = new int[size];

        //input
		System.out.println("\nEnter array elements : ");
		for(int i = 0; i < size ; i++)
		{
			ar[i] = sc.nextInt();
		}


		//display
		System.out.println("\nUnsorted Array elements are : ");
		for(int i = 0; i < ar.length ; i++)
		{
			System.out.print(ar[i] + "  ");
		}


		//count frequency of uscorted array
		System.out.println("\n\nFrequency count of the elements in the array:");
        for (int i = 0; i < size; i++) 
        {
            if (ar[i] == 0) {
                continue; // Skip elements that have already been counted
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    ar[j] = 0; // Mark as counted
                }
            }

            System.out.println(ar[i] + "  " + count);
        }
		
	}
	
}