/*
selection sort

--------------------

take 1st element as smallest and compare it with remaining
now compare the elements for to find the smallest 
in first pass the minimum element comes at index 0

for next paas take 2nd element as the smallest and compare it with remaining 
continue the process

--------------------

in selection sort elements will be sorted from the index 0 position 

---------------------
*/

import java.util.*;

class selection{
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
		System.out.println("\n\nUsing selection sort : ");

		for(int i = 0 ; i < size - 1; i++)
		{
			int small = i;
			for(int j = i+1 ; j < size ; j++)
			{
				if(ar[small] > ar[j])
				{
					small = j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[small];
			ar[small] = temp;
		}

		//------------------------------------------

		System.out.print("\nSorted array : ");
		for(int i = 0 ; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
	}
}