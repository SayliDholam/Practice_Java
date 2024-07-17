
import java.util.*;


class insertion
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

		insert(arr);
		System.out.println("\nInsertion sort : ");
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}



	//logic
	static void insert(int[] array)
	{
		for (int i = 0 ;i < array.length-1 ;i++ ) 
		{
			for (int j = i+1;j>0 ;j-- ) 
			{
				if(array[j-1] > array[j])
				{
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;

				}
				else
				{
					break;
				}
				
			}
		}
	}

}