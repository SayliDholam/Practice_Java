//find nth fibonacci number using recursion

import java.util.*;


class Fibo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		System.out.println("Fibonacci series till " + num + " numbers is : ");
		for (int i = 0 ; i < num; i++) 
		{
			System.out.print(fibonacci(i) + "  ");
		}
	}


	//logic
	static int fibonacci(int n)
	{
		if(n < 2)
		{
			return n;
		}

		return fibonacci(n-1) + fibonacci(n-2);

	}
}