import java.util.*;
class program2{
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	public static class Stack{
		Node head = null;
		int size = 0;

		void display(){
			Node temp = head;
			System.out.println("Stack elements are:");
			while(temp != null){
				System.out.print(temp.data + "\t");
				temp = temp.next;
			}
			System.out.println();
		}

		void push(int value){
			Node temp = new Node(value);
			temp.next = head;
			head = temp;
			size++;	
		}

		int pop(){
			if(head == null){
				System.out.println("Stack is empty");
				return -1;
			}
			int x = head.data;
			head = head.next;
			size--;
			return x;
		}

		int peek(){
			if(head == null){
				System.out.println("Stack is empty");
				return -1;
			}
			return head.data;
		}

		int size(){
			return size;
		}

		boolean isEmpty(){
			if(size == 0)
				return true;
			return false;
		}

		void printrev(Node node){
			if (node == null) {
               	return;
           	}
           	printrev(node.next);
          	System.out.print(node.data + "\t");
		}

		void reverse(){
			printrev(head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		System.out.println();
		System.out.println("Popping the top element: " + st.pop());
		st.display();
		System.out.println();
		System.out.println("Peeking at the top element: " + st.peek());
		System.out.println();
		System.out.println("The size of the stack is: " + st.size());
		System.out.println();
		System.out.println("Is the Stack empty: " + st.isEmpty());
		System.out.println();
		System.out.println("Reversing the Stack:");
		st.reverse();
	}
}