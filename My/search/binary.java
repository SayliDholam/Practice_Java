//binary search - 1D array


import java.util.*;


class binary
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int[] ar = new int[size];

		System.out.println("\nEnter array elements : ");
		for(int i = 0 ; i <size ; i++)
		{
			ar[i] = sc.nextInt();
		}


		sort(ar);

		System.out.println("\nSorted array: ");
        for (int i = 0; i < ar.length; i++) 
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println(); 


        System.out.println("\nEnter the element to search : ");
        int target = sc.nextInt();

        int ans = bSearch(ar, target);

        if (ans != -1) 
        {
            System.out.println("\nElement " + target +" found at index " + ans);
        } else 
        {
            System.out.println("\nElement " + target +" not found in the array");
        }
	}



	//sort logic
	static void sort(int[] array)
	{
		for(int i = 0 ; i < array.length; i++)
		{
			for (int j = 0; j < array.length - i - 1; j++) 
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
				}
			}
		}
	}



	//search logic
	static int bSearch(int[] array, int target)
	{
		int start = 0 ; 
		int end = array.length - 1;

		while(start <= end)
		{
			int mid = start + (end - start) / 2;

			if(target < array[mid])
			{
				end = mid - 1;
			}
			else if(target > array[mid])
			{
				start = mid + 1;
			}
			else 
			{
				return mid;
			}
		}
		return -1;
	}

}