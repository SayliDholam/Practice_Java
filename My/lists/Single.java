//singly linked lists


import java.util.*;


//sll class
class SLL
{
	Node head;
	Node tail;
	int size;

	public SLL()
	{
		this.size = 0;
	}

	//internal node creation class
	class Node
	{
		int value;
		Node next;

		public Node(int value)
		{
			this.value = value;
		}

		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}


	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL");
	}

	public void insertFront(int val)
	{
		Node node = new Node(val);
		node.next = head;
		head = node;
		if(tail == null)
		{
			tail = head;
		}
		size++;
	}

	public void insertLast(int val)
	{
		if(tail == null)
		{
			insertFront(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

	public void insertAny(int val, int index)
	{
		if(index == 0)
		{
			insertFront(val);
			return;
		}
		if(index == size)
		{
			insertLast(val);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index ;i++ ) 
		{
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}

	public int deleteFront()
	{
		int val = head.value;
		head = head.next;
		if(head == null)
		{
			tail = null;
		}
		size--;
		return val;
	}

	//helper 
	public Node get(int index)
	{
		Node node = head;
		for (int i = 0; i<index ;i++ ) 
		{
			node = node.next;
		}
		return node;
	}

	public int deleteLast()
	{
		if(size <= 1)
		{
			return deleteFront();
		}
		Node secondlast = get(size-2);
		int val = tail.value;
		tail = secondlast;
		tail.next = null;
		size--;
		return val;
	}

	public int deleteAny(int index)
	{
		if(index == 0)
		{
			return deleteFront();
		}
		if(index == size - 1)
		{
			return deleteLast();
		}

		Node prev = get(index - 1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return val;
	}

	public Node search(int val)
	{
		Node node = head;
		while(node != null)
		{
			if(node.value == val)
			{
				return node;
			}
			node = node.next;
		}
		return null;
	}

	 public int size() {
        return size;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head; // Update the tail to the current head before reversing

        while (current != null) {
            next = current.next; // Save next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev and current one step forward
            current = next;
        }

        head = prev; // Update head to the last non-null node
    }
} 




//main class
class Single
{
	public static void main(String[] args) 
	{
		SLL s1 = new SLL(); 

		s1.insertFront(5);
		s1.insertFront(9);
		s1.insertFront(24);
		s1.insertFront(89);

		s1.insertLast(28);
		s1.insertAny(100,3);
		s1.display();

		System.out.println();
		System.out.println("Deleted node is : " + s1.deleteFront());
		s1.display();

		System.out.println();
		System.out.println("Deleted node is : " + s1.deleteLast());
		s1.display();

		System.out.println();
		System.out.println("Deleted node  index is : " + s1.deleteAny(2));
		s1.display();

		System.out.println();
		System.out.println("Search node value is : " + s1.search(2));
	    System.out.println("Search node value is : " + s1.search(24));

        System.out.println("Size of linked list is: " + s1.size());

        System.out.println("Reversing the linked list : ");
        s1.reverse();
        s1.display();

	}
}