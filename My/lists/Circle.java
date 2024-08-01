//circular linked list


import java.util.*;


class CLL
{
	Node head;
	Node tail;
	int size;

	public CLL()
	{
		this.size = 0;
		this.head = null;
		this.tail = null;
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


	public void insert(int val) 
	{
        Node node = new Node(val);
        if (head == null) 
        {
            head = node;
            tail = node;
            node.next = head; 
        } 
        else 
        {
            tail.next = node;
            node.next = head; 
            tail = node;
        }
        size++;
    }


	public void display()
	{
		Node node = head;
		if(head != null)
		{
			do
			{
				System.out.print(node.value + " -> ");
				node = node.next;
			}
			while(node != head);

		}
	}


	 public void delete(int val) 
	 {
        if (head == null) 
        {
            return;
        }

        Node node = head;
        Node prev = tail;

        if (node.value == val) 
        {
            if (head == tail) 
            {
                head = null;
                tail = null;
            } 
            else 
            {
                head = head.next;
                tail.next = head;
            }
            size--;
            return;
        }

        do 
        {
            Node n = node.next;
            if (n.value == val) 
            {
                node.next = n.next;
                if (n == tail) 
                {
                    tail = node;
                }
                size--;
                break;
            }
            prev = node;
            node = node.next;
        } while (node != head);
    }
}



class Circle
{
	public static void main(String[] args) 
	{

		CLL c1 = new CLL();

		c1.insert(96);
		c1.insert(46);
		c1.insert(2);
		c1.insert(75);
		c1.insert(34);

		c1.display();

		System.out.println();

		c1.delete(46);

		c1.display();

	}

}