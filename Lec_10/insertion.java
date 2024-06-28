//insertion sort 
/*

divide array into 2 subaarays - sorted & unsoretd
1st half - sorted
2nd half - unsorted
[sorted]  [unsorted]

-------------------------------

*/

import java.util.*;

class insertion
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int[] ar = new int[size];

		//----------------------------------------

        //input
		System.out.println("\nEnter array elements : ");
		for(int i = 0; i < size ; i++)
		{
			ar[i] = sc.nextInt();
		}


		//display
		System.out.println("\nArray elements are : ");
		for(int i = 0; i < ar.length ; i++)
		{
			System.out.print(ar[i] + "  ");
		}

		//----------------------------------------
		//logic
		System.out.println("\n\nUsing insertion sort : ");

		for(int i = 0 ; i < size; i++)
		{
			int current = ar[i];
			int j = i - 1;
			while((j >= 0) && (ar[j] > current))
			{
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = current;	
		}

		//------------------------------------------

		//display
		System.out.print("\nSorted array : ");
		for(int i = 0 ; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
			
	}
}