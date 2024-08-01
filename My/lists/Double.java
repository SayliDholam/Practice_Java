//double linked list


import java.util.*;


//dll 
class DLL
{
	Node head;
	Node tail;
	int size;

	public DLL()
	{
		this.size = 0;
	}

	//internal node creation class
	class Node
	{
		int val;
		Node next;
		Node prev;

		public Node(int val)
		{
			this.val = val;
		}

		public Node(int val, Node next, Node prev)
		{
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}


	public void display()
	{
		Node last = null;
		Node temp = head;
		System.out.println("\nPrint list : ");
		while(temp != null)
		{
			System.out.print(temp.val + " -> ");
			last = temp;
			temp = temp.next;
		}
		System.out.print("NULL");

		System.out.println("\n\nPrint reverse list : ");
		while(last != null)
		{
			System.out.print(last.val + " -> ");
			last = last.prev;
		}
		System.out.print("NULL");
	}


	public void insertFront(int val)
	{
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(tail != null)
		{
			head.prev = node;
		}
		else 
		{
            
            tail = node;
        }
		head = node;
		size++;
	}


	public void insertLast(int val) 
	{
        Node node = new Node(val);
        node.next = null; 
        if (tail == null) 
        { 
            node.prev = null;
            head = node;
            tail = node;
        } 
        else 
        {
            tail.next = node; 
            node.prev = tail;
            tail = node; 
        }
        size++;
    }


    public Node search(int val)
	{
		Node node = head;
		while(node != null)
		{
			if(node.val == val)
			{
				return node;
			}
			node = node.next;
		}
		return null;
	}


	public void insertAny(int after, int val)
	{
		Node p = search(after);
		if(p == null)
		{
			System.out.println("Does not exists");
			return;
		}
		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if(node.prev != null)
		{
			node.next.prev = node;
		}
		size++;
	}


    public int deleteFront() 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return -1; 
        }
        int val = head.val;
        head = head.next;
        if (head != null) 
        {
            head.prev = null;
        } 
        else 
        {
            tail = null; 
        }
        size--;
        return val;
    }


    public int deleteLast() 
    {
        if (tail == null) 
        {
            System.out.println("List is empty");
            return -1; 
        }
        int val = tail.val;
        tail = tail.prev;
        if (tail != null) 
        {
            tail.next = null;
        } 
        else 
        {
            head = null; 
        }
        size--;
        return val;
    }


    public int deleteAny(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1; 
        }
        if (index == 0) {
            return deleteFront();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        int val = node.val;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return val;
    }

    public int size() 
    {
        return size;
    }
}



class Double
{
	public static void main(String[] args) 
	{
		DLL d1 = new DLL(); 

		d1.insertFront(5);
		d1.insertFront(9);
		d1.insertFront(24);
		d1.insertFront(89);

		d1.insertLast(74);
		d1.insertAny(24, 1);

		d1.display();

		System.out.println();
		System.out.println("Deleted node is : " + d1.deleteFront());
		d1.display();

		System.out.println();
		System.out.println("Deleted node is : " + d1.deleteLast());
		d1.display();

		System.out.println();
		System.out.println("Deleted node  index is : " + d1.deleteAny(2));
		d1.display();

		System.out.println();
		System.out.println("Search node value is : " + d1.search(2));
	    System.out.println("Search node value is : " + d1.search(24));

        System.out.println("Size of linked list is: " + d1.size());

	}
}