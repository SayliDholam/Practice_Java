//linked list

/*

*/

class linked
{

	//recursive display reverse recursive
	public static void displayRR(Node head)
	{
		if(head == null) return;
		displayRR(head.next);
		System.out.println(head.data);
		
	}

	//recursive display recursive
	public static void displayR(Node head)
	{
		if(head == null) return;
		System.out.println(head.data);
		displayR(head.next);
		
	}

	//method to display
	public static void display(Node head)
	{
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}

	}

	//count of the node or length of the linked list
	public static int length(Node head)
	{
		int count = 0 ;
		while(head != null)
		{
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
		}

	}

	public static void main(String[] args) 
	{
		Node d = new Node(10);
		Node d2 = new Node(30);
		Node d3 = new Node(86);
		Node d4 = new Node(45);

		d.next = d2;
		d2.next = d3;
		d3.next = d4;

		display(d);
		System.out.println();

		displayR(d);
		System.out.println();

		displayRR(d);
		System.out.println();

		System.out.print("Length of the list is : " + length(d));
		System.out.println();



	

		/*
		System.out.println(d.data);
		System.out.println(d.next.data);
		System.out.println(d.next.next.data);
		System.out.println(d.next.next.next.data);

		System.out.println(d);
		System.out.println(d.data);
		System.out.println(d.next);
		System.out.println();

		System.out.println(d2);
		System.out.println(d2.data);
		System.out.println(d2.next);
		System.out.println();

		System.out.println(d3);
		System.out.println(d3.data);
		System.out.println(d3.next);
		System.out.println();

		System.out.println(d4);
		System.out.println(d4.data);
		System.out.println(d4.next);
		System.out.println();
		*/
		
	}
}

