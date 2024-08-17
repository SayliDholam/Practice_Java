//custom queue


class Queues_2
{
	private int[] data;
	private static final int DEFAULT_SIZE = 10;
	int end = 0;

	public Queues_2()
	{
		this(DEFAULT_SIZE);
	}

	public Queues_2(int size)
	{
		this.data = new int[size];
	}

	private boolean isFull()
	{
		return end == data.length  ;
	}

	private boolean isEmpty()
	{
		return end == 0 ;
	}

	public boolean insert(int item)
	{
		if(isFull())
		{
			return false;
		}
		data[end++] = item;
		return true;
	}

	public int remove()
	{
		if (isEmpty())
		{
			System.out.println("Queue empty");
		}
		int removed = data[0];
		for (int i = 1; i<end ;i++) 
		{
			data[i-1] = data[i];
		}
		end--;
		return removed;
	}

	public int front()
	{
		if (isEmpty())
		{
			System.out.println("Queue empty");
		}
		return data[0];

	}

	public void display()
	{
		for (int i = 0; i < end; i++) 
		{
			System.out.print(data[i] + " <- ");
		}
		System.out.println("end");
	}


	public static void main(String[] args) 
	{
		Queues_2 qu = new Queues_2(5);
		qu.insert(65);
		qu.insert(5);
		qu.insert(86);
		qu.insert(3);
		qu.insert(7);

		qu.display();
		qu.front();

		qu.remove();
		qu.display();
	}
}