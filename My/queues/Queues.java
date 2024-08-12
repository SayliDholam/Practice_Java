//inbuilt queue


import java.util.*;

class Queues
{
	public static void main(String[] args) {

	Queue<Integer> qu = new LinkedList<>();

	qu.add(3);
	qu.add(6);
	qu.add(35);
	qu.add(453);
	qu.add(13);
	qu.add(89);
	 qu.offer(6);

	System.out.println(qu.peek());
	System.out.println(qu.remove());
	System.out.println(qu.peek());
	System.out.println(qu.poll());

	System.out.println("Does the queue contain 35? " + qu.contains(35));
	System.out.println("Does the queue contain 13? " + qu.contains(13));

	 System.out.println("Size of the queue: " + qu.size());

	 System.out.println("Is the queue empty?" + qu.isEmpty());
	 qu.clear();
	 System.out.println("Is the queue empty after clearing? " + qu.isEmpty());

	}	
}