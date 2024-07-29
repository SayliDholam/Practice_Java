import java.util.Scanner;

class Quick
{
	
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("\nEnter the elements: ");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, (arr.length-1));

        System.out.println("\nUsing quick sort: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
	}


	 // quick sort function
    static void quickSort(int[] nums, int low, int hi)
    {
    	if(low >= hi)
        {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s) / 2;
        int pivot = nums[m];

        while(s <= e)
        {
            //already sort then not sort it
            while(nums[s] < pivot)
            {
                s++;
            }
            while(nums[e] > pivot)
            {
                e--;
            }

            if( s <= e)
            {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //pivot @correct index to sort 2 halves
        quickSort(nums, low, e);
        quickSort(nums, s, hi);
    }
}