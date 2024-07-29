import java.util.Scanner;

class Merge 
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

        mergeSort(arr, 0, arr.length);

        System.out.println("\nUsing merge sort: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }


    // Merge sort function
    static void mergeSort(int[] arr, int s, int e) 
    {
        if ((e - s) < 2) 
        {
            return; 
        }

        int mid = (s + e) / 2;

        // Recursively sort the left half and right half
        mergeSort(arr, s, mid);  //left
        mergeSort(arr, mid, e);  //right

        // Merge the sorted halves
        merge(arr, s, mid, e);
    }


    // Merge two sorted subarrays
    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        // Initial index of the first subarray  //left
        int i = s; 
        // Initial index of the second subarray //right
        int j = m; 
        // Initial index of the merged subarray //for new final sorted k array
        int k = 0; 

        while (i < m && j < e) 
        {
            if (arr[i] <= arr[j]) 
            {
                mix[k] = arr[i];
                i++;
            } 
            else 
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left subarray, if any
        while (i < m) 
        {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements of right subarray, if any
        while (j < e) 
        {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back into the original array
        for (int l = 0; l < mix.length; l++) 
        {
            arr[s + l] = mix[l];
        }
    }
}
