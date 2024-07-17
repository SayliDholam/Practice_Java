//linear search - numbers


import java.util.*;

class linear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size : ");
		int size = sc.nextInt();

		int[] ar = new int[size];

        //input
		System.out.println("\nEnter array elements : ");
		for(int i = 0; i < size ; i++)
		{
			ar[i] = sc.nextInt();
		}

		System.out.println("Enter the element to search : ");
		int target = sc.nextInt();


		//function call
		int ans = lsearch(ar,target);
		System.out.println("Element " + target +" found at indexed position " + ans );

	}




	//logic
	static int lsearch(int[] arrs, int target)
	{
		if(arrs.length == 0)
		{
			return -1;
		}

		for(int i = 0 ; i < arrs.length; i++)
		{
			int element = arrs[i];
			if(element == target)
			{
				return i;

			}		
		}

		return -1;
	}
}
