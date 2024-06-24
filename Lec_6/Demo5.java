/*
1. wap to print first 50 odd numbers -- for
2. wap to print first 10 square numbers -- while
3. wap to print first 20 cubes -- do while 
4. 10 --> 3 5 7 9 --> any loop continue
5. 10 --> 1,2,3,4 -- break at 4 -- any loop
6. wrong input
*/

import java.util.*;

class Demo5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 1st 50 odd numbers");
		System.out.println("2. 1st 10 squares");
		System.out.println("3. 1st 20 cubes");
		System.out.println("4. print only : 3 5 7 9");
		System.out.println("5. print only : 1 2 3 4");

		System.out.println("Enter your choice : ");
		int num = sc.nextInt();

		switch(num)
		{
		case 1 :
			for(int i = 1; i <= 50; i++)
			{
				if(i % 2 != 0)
				{
					System.out.print(i);
					System.out.print("\t");
				}
			}
			break;

		case 2:
			int i = 1;
			while(i <= 10)
			{
				System.out.print(i*i);
				System.out.print("\t");
				i++;
			}
			break;

		case 3:
			int j = 1 ;
			do
			{
				System.out.print(j*j*j);
				System.out.print("\t");
				j++;
			}
			while(j <= 20);
			break;

		case 4:
			int k = 2;
			while (k <= 10) {
			 	if (k % 2 == 0) {
			 		k++;
			 		continue;
			 	} 
			 	else {
			 		System.out.print(k);
			 		System.out.print("\t");
			 	}
			 	k++;
			}
			break;

		case 5:
			int n = 1;
			while( n <= 10)
			{
				System.out.print(n);
				System.out.print("\t");
				if( n == 4)
				{
					break;
				}
				n++;
			}

			break;

		default:
			System.out.println("wrong choice");

	    }

	}
}