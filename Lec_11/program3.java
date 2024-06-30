import java.util.*;
class program3{

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	public static class Queue{
		Node head = null;
		Node tail = null;
		int size = 0;

		void display(){
			Node temp = head;
			if(head == null){
				System.out.println("Queue is empty");
			}
			System.out.println("Elements is the Queue are:");
			while(temp != null){
				System.out.print(temp.data + "\t");
				temp = temp.next;
			}
			System.out.println();
		}

		void add(int value){
			Node temp = new Node(value);
			if(head == null){
				head = tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}

		int delete(){
			if(size == 0){
				System.out.println("Queue is empty");
				return -1;
			}
			int x = head.data;
			head = head.next;
			size--;
			return x;
		}

		int peek(){
			if(size == 0){
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;
		}

		boolean isEmpty(){
			if(size == 0)
				return true;
			return false;
		}

		int size(){
			return size;
		}
	}

	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.add(10);
		qu.add(20);
		qu.add(30);
		qu.add(40);
		qu.add(50);
		qu.display();
		System.out.println();
		System.out.println("Deleting the top element from queue: " + qu.delete());
		qu.display();
		System.out.println();
		System.out.println("Peeking at the top element from queue: " + qu.peek());
		System.out.println();
		System.out.println("Is the Queue empty: " + qu.isEmpty());
		System.out.println();
		System.out.println("Size of the queue is: " + qu.size());
	}
}