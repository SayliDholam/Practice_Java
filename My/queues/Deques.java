//inbuilt dequeue


import java.util.*;

class Deques {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(65);  
        dq.addLast(4);   
        dq.add(74);       
        dq.offerFirst(12); 
        dq.offerLast(35); 

        System.out.println("Deque: " + dq);

        System.out.println("First element (peekFirst): " + dq.peekFirst()); 
        System.out.println("Last element (peekLast): " + dq.peekLast());   

        System.out.println("Removed first element (removeFirst): " + dq.removeFirst());
        System.out.println("Removed last element (removeLast): " + dq.removeLast());

        // Polling elements (removes and returns, returns null if deque is empty)
        System.out.println("Polled first element (pollFirst): " + dq.pollFirst());
        System.out.println("Polled last element (pollLast): " + dq.pollLast());

        System.out.println("Contains 74? " + dq.contains(74));

        System.out.println("Deque after operations: " + dq);
    }
}
