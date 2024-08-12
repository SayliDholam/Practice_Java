//custom stack


class Stacks_2
{

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	int ptr = -1;
	
	public Stacks_2()
	{
		this(DEFAULT_SIZE);
	}

	public Stacks_2(int size)
	{
		this.data = new int[size];
	}

	public int push(int item)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		ptr++;
		data[ptr] = item;
		return data[ptr];
	}

	public int pop() 
	{
		if(isEmpty())
		{
			System.out.println("Cannot pop, stack empty");
		}
		int remove = data[ptr];
		ptr--;
		return remove;
	}

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Cannot peek, stack empty");
		}
		return data[ptr];
	}

	private boolean isFull()
	{
		return ptr == data.length -1 ;
	}

	private boolean isEmpty()
	{
		return ptr == -1 ;
	}



	public static void main(String[] args) 
	{
		Stacks_2 stk = new Stacks_2(4);

		System.out.println("\nEntering elements in stack : ");
		System.out.println(stk.push(765));
		System.out.println(stk.push(22));
		System.out.println(stk.push(85));
		System.out.println(stk.push(56));
		//System.out.println(stk.push(76));

		System.out.println("\nPeeking in stack : ");
		System.out.println(stk.peek());

		System.out.println("\nRemoving elements in stack : ");
		System.out.println(stk.pop());
		System.out.println(stk.pop());

		System.out.println("\nPeeking in stack : ");
		System.out.println(stk.peek());
	}
}