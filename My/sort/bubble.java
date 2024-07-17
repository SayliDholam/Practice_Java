//bubble sort


import java.util.*;

class bubble
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter size of array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("\nEnter elements : ");
		for(int i = 0 ; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}

		bubble_asc(arr);
		System.out.println("\nBubble sort - ascending : ");
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}

		

		bubble_desc(arr);
		System.out.println("\n\nBubble sort - descending : ");
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}


	//logic
	static void bubble_asc(int[] array)
	{
		boolean swap ;
		for (int i = 0 ; i < array.length ;i++ ) 
		{
			swap = false;
			for (int j = 1; j<array.length-i ;j++ ) 
			{
				if (array[j - 1] > array[j]) 
				{
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;

					swap = true;
				}
				
			}
			if(swap == false)
			{
				break;
			}
		}
	}



	//logic
	static void bubble_desc(int[] array)
	{
		boolean swap ;
		for (int i = 0 ; i < array.length ;i++ ) 
		{
			swap = false;
			for (int j = 1; j<array.length-i ;j++ ) 
			{
				if (array[j - 1] < array[j]) 
				{
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;

					swap = true;
				}
				
			}
			if(swap == false)
			{
				break;
			}
		}

	}
}