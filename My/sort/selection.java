
import java.util.*;


class selection
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

		select_1(arr);
		System.out.println("\nSelection sort : ");
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}


	}

	//consider 1st as min
	static void select_1(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++) 
		{
			int index = i;
			for (int j = i+1; j < array.length ; j++) 
			{
				if(array[index] > array[j])
				{
					index = j ;
				}
			}
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}
}