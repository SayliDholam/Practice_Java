/*
conditional statements : decides flow of execution based on true and false statments

nested if vs ladder if -
nested if : conditions are dependent 
ladder if : conditions are independent 

*/


//wap to check if a number is even or odd, without using % operator


import java.util.*;

class Demo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		//using and 
		if((num & 1) == 1)
		{
			System.out.println("number is odd");
		}
		if((num & 1) == 0)
		{
			System.out.println("number is even");
		}

		//using or
		if((num | 1) == num)
		{
			System.out.println("number is odd");
		}
		if((num | 1) == num+1)
		{
			System.out.println("number is even");
		}
		
		//using xor
		if((num ^ 1) == num-1)
		{
			System.out.println("number is odd");
		}
		if((num ^ 1) == num+1)
		{
			System.out.println("number is even");
		}
	}
}
