//circular queue


class CQueues 
{
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;

    public CQueues() {
        this(DEFAULT_SIZE);
    }

    public CQueues(int size) {
        this.data = new int[size];
    }

    private boolean isFull() {
        return size == data.length; 
    }

    private boolean isEmpty() {
        return size == 0; 
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1; 
        }
        int removed = data[front];
        front = (front + 1) % data.length; // Increment front and then apply modulo
        size--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1; 
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }
        int i = front;
        int count = 0;
        while (count < size) {
            System.out.print(data[i] + " <- ");
            i = (i + 1) % data.length;
            count++;
        }
        System.out.println("end");
    }



    public static void main(String[] args) {
        CQueues cq = new CQueues(5);

        cq.insert(13);
        cq.insert(46);
        cq.insert(76);
        cq.insert(22);
        cq.insert(3);

        cq.display();

        System.out.println("Front element: " + cq.front());

        cq.remove();
        cq.display();
    }
}
