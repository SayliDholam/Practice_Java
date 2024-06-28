/*
SINGLY LINK LIST


*/

class linked2 {
    // Node class
    public static class Node2 {
        int data;
        Node2 next;

        Node2(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node2 head = null;
        Node2 tail = null;

        // method to insert node at the end
        void insertAtEnd(int val) {
            Node2 temp = new Node2(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // method to insert node at the beginning
        void insertAtFront(int val) {
            Node2 temp = new Node2(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // method to insert at a particular position
        void insertAt(int idx, int val) {
            Node2 T = new Node2(val);
            Node2 temp = head;

            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtFront(val);
                return;
            } else if ((idx < 0) || idx > size()) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 1; i <= (idx - 1); i++) {
                temp = temp.next;
            }
            T.next = temp.next;
            temp.next = T;
        }

        // method to display
        void display() {
            Node2 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // count of the node or length of the linked list
        int size() {
            Node2 temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // delete the node at a particular position
        void deleteAt(int idx) {
            if (idx == 0) {
                deleteAtFront();
                return;
            } else if (idx == size() - 1) {
                deleteAtEnd();
                return;
            } else if (idx < 0 || idx >= size()) {
                System.out.println("Wrong index");
                return;
            }
            Node2 temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }

        // delete at front
        void deleteAtFront() {
            if (head != null) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            }
        }

        // delete at end
        void deleteAtEnd() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = tail = null;
                return;
            }
            Node2 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertAtEnd(34);
        l1.insertAtEnd(19);
        l1.insertAtEnd(87);

        l1.insertAtFront(57);
        l1.insertAtFront(9);
        l1.insertAtFront(46);

        l1.insertAt(3, 4);
        l1.display();
        System.out.println("Size of the single linked list is : " + l1.size());

        l1.deleteAt(2);
        l1.display();
        System.out.println("Size of the single linked list is : " + l1.size());

        l1.deleteAtFront();
        l1.display();
        System.out.println("Size of the single linked list is : " + l1.size());

        l1.deleteAtEnd();
        l1.display();
        System.out.println("Size of the single linked list is : " + l1.size());
    }
}
