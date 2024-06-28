/*
SORTING:

bubble
selection
insertion
merge
quick

------------------------
bubble :

each element is compared with every other element
2 for loops used
at the end of first pass the largest element is bubbled at the end 
time complexity - O(n^2)

*/

import java.util.*;

class bubble
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

		System.out.println("\n\nUsing bubble sort : ");

        //----------------------------------------

		for(int i = 0 ; i < size; i++)
		{
			int flag = 0;
			for(int j = 0 ; j < size-1-i; j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = 1;
				}
				if(flag == 0)
				{
					break;
				}
			}
		}
		
		System.out.print("\nAscending Sorted array : ");
		for(int i = 0 ; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}

        //---------------------------------------------------------

		for(int i = 0 ; i < size; i++)
		{
			for(int j = 0 ; j < size-1-i; j++)
			{
				if(ar[j] < ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}

		System.out.print("\nDescending Sorted array : ");
		for(int i = 0 ; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}

	}
}