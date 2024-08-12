//inbuilt stack


import java.util.*;

class Stacks
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();

		st.push(65);
		st.push(97);
		st.push(24);
		st.push(7);
		st.push(32);

		System.out.println(st.pop());
		System.out.println(st.pop());

		System.out.println("Top element (peek): " + st.peek());

		System.out.println("Is stack empty? " + st.empty());
	}
}