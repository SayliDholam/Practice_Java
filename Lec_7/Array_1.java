/*arrays 

arrays - collection of similar data type, homogenous collection, takes continous memory location, fixed size, index based accessing of elements.

adv : same type multiple values ordered storage

disadv : not dynamic, cannot store different data types, fixed size, not having standard inbuilt methods, not proper for insertion & deletion of elements

when to use : for traversing continous elements 

to overcome the limitations of arrays , we use collection framework


-----------------------------

array declarations :

int a[] = {1,2,3}
int[] a = {1,2,3}
int[] a = new int[5]

----------------------------


*/

//QUESTIONS:

//1.take input from user for array size and elements & display the same.
//2.sum of the elements
//3.product of the elements
//4.sum of even elements
//5.sum of odd elements
//6.even index sum 
//7.odd index sum
//8.reverse array elements
//9.skip the even numbers and odd numbers 
//10.skip the even index and odd index 
//11.find max element
//12.find min element
//13.sum of min and max
//14.product of min and max
//15.difference of product and sum of max and min element
//16.find length of this difference number
//17.find 2nd max element & find 2nd min element --> using sort()
//18.find 2nd max element & find 2nd min element --> using bubble sort logic
//19.join 2nd max and min element
//20.find frequency count of the elements in the sorted array
//21.sawp using : temp, + - , * /, ^


//----------------------------------------------------------------------------------------------------

import java.util.*;

class Array_1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int[] ar = new int[size];

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


		//sum
		System.out.println("\n\nSum of all elements");
		int sum = 0;
		for(int i = 0; i < size; i++)
		{
			sum += ar[i];
		}
		System.out.print(sum);


		//product
		System.out.println("\n\nProduct of all elements");
		int prod = 1;
		for(int i = 0; i < size; i++)
		{
			prod *= ar[i];
		}
		System.out.print(prod);


		//sum of even elements
		System.out.println("\n\nsum of even elements");
		int even = 0;
		for(int i = 0; i < size; i++)
		{
			if(ar[i] % 2 == 0)
			{
				even += ar[i];
			}
		}
		System.out.print(even);


		//sum of odd elements
		System.out.println("\n\nsum of odd elements");
		int odd = 0;
		for(int i = 0; i < size; i++)
		{
			if(ar[i] % 2 == 1)
			{
				odd += ar[i];
			}
		}
		System.out.print(odd);


		//even index sum
		System.out.println("\n\nsum of even index");
		int evenindex = 0;
		for(int i = 0; i < size; i++)
		{
			if(i % 2 == 0)
			{
				evenindex += ar[i];
			}
		}
		System.out.print(evenindex);


		//odd index sum
		System.out.println("\n\nsum of odd index");
		int oddindex = 0;
		for(int i = 0; i < size; i++)
		{
			if(i % 2 == 1)
			{
				oddindex += ar[i];
			}
		}
		System.out.print(oddindex);


		//reverse array elements
		System.out.println("\n\nreverse array elements");
		for(int i = size-1; i >= 0 ; i--)
		{
			System.out.print(ar[i] + " ");
		}


		//skip the even numbers  
		System.out.println("\n\nskip even elements");
		for(int i = 0; i < size; i++)
		{
			if(ar[i] % 2 == 0)
			{
				continue;
			}
			System.out.print(ar[i] + " ");	
		}


		//skip the odd numbers  
		System.out.println("\n\nskip odd elements");
		for(int i = 0; i < size; i++)
		{
			if(ar[i] % 2 == 1)
			{
				continue;
			}
			System.out.print(ar[i] + " ");	
		}
		


		//skip the even index 
		System.out.println("\n\nskip even index");
		for(int i = 0; i < size; i++)
		{
			if(i % 2 == 0)
			{
				continue;
			}
			System.out.print(ar[i] + " ");	
		}


		//skip the odd index 
		System.out.println("\n\nskip odd index");
		for(int i = 0; i < size; i++)
		{
			if(i % 2 == 1)
			{
				continue;
			}
			System.out.print(ar[i] + " ");	
		}



		//max element
		System.out.println("\n\nmaximum element");
		int max = ar[0];
		for(int i = 0 ; i < size; i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
			}
		}
		System.out.print(max);


		//min element
		System.out.println("\n\nminimum element");
		int min = ar[0];
		for(int i = 0 ; i < size; i++)
		{
			if(ar[i] < min)
			{
				min = ar[i];
			}
		}
		System.out.print(min);




		//sum of min and max
		System.out.println("\n\nsum of max and min elements");
		int sum_ = max + min;
		System.out.print(sum_);




		//product of min and max
		System.out.println("\n\nproduct of max and min elements");
		int prod_ = max * min;
		System.out.print(prod_);




		//difference of product and sum of max and min element
		System.out.println("\n\ndifference of product and sum of max and min elements");
		int diff =  prod_ - sum_;
		System.out.print(diff);




		//find length of this difference number
		System.out.println("\n\nlength of the number of the difference of product & sum of max & min elements");
		int length = 0;
		while(diff > 0)
		{
			diff = diff / 10;
			length++;
		}
		System.out.print(length);




		//find 2nd max element and find 2nd min element  --> arrays.sort
		/*
		Arrays.sort(ar);
		int max2nd = ar[size - 2];
		int min2nd = ar[1];
		System.out.println("\n\nfind 2nd max& min - Using arrays.sort() method : ");
		System.out.print("2nd max element : " + max2nd);
		System.out.print("\t2nd min element : " + min2nd);
		*/



		//find 2nd max element and find 2nd min element  --> bubble sort
		System.out.println("\n\nfind 2nd max& min - bubble sort : ");

		System.out.print("\nUnsorted array : ");
		for(int i = 0 ; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}

		for(int i = 0 ; i < size; i++)
		{
			for(int j = 0 ; j < size-1-i; j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.print("\nSorted array : ");
		for(int i = 0 ; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}

		int max2nd_bubble = ar[size - 2];
		int min2nd_bubble = ar[1];
		System.out.print("\n2nd max element : " + max2nd_bubble);
		System.out.print("\t2nd min element : " + min2nd_bubble);




		//join 2nd max and min element
		System.out.println("\n\njoin 2nd max and min element: ");
		String max_bub = Integer.toString(max2nd_bubble);
		String min_bub = Integer.toString(min2nd_bubble);
		String join = max_bub + min_bub;
		System.out.println("\njoin " + join);



		//find frequency count of the elements in the sorted array
		System.out.println("\n\nfrequency count of the elements in the sorted array :");
		int freq = 1;
		int inc = 1;
		while(inc < ar.length)
		{
			while((ar[inc] == ar[inc-1]) && (inc<ar.length))
			{
				freq++;
				inc++;
			}
			System.out.println(ar[inc-1] + "  " + freq);
			freq = 1;
			inc++;
		}
		if((ar[inc - 1] != ar[inc - 2]) || (ar.length == 1))
		{
			System.out.println(ar[inc-1] + "  " + freq);
		}
			

		//swapping numbers
		System.out.println("\n\nswapping numbers: ");
		//using temp
		System.out.println("Using temp : ");
		int a = 10;
		int b = 20;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		//using + -
		System.out.println("Using + - : ");
		int a1 = 10;
		int b1 = 20;
		System.out.println("a = " + a1);
		System.out.println("b = " + b1);
		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;
		System.out.println("a = " + a1);
		System.out.println("b = " + b1);

		//using * /
		System.out.println("Using * / : ");
		int a2 = 10;
		int b2 = 20;
		System.out.println("a = " + a2);
		System.out.println("b = " + b2);
		a2 = a2*b2;
		b2 = a2/b2;
		a2 = a2/b2;
		System.out.println("a = " + a2);
		System.out.println("b = " + b2);

		//using ^
		System.out.println("Using ^ : ");
		int a3 = 10;
		int b3 = 20;
		System.out.println("a = " + a3);
		System.out.println("b = " + b3);
		a3 = a3^b3;
		b3 = a3^b3;
		a3 = a3^b3;
		System.out.println("a = " + a3);
		System.out.println("b = " + b3);

	}
}

