public class PriorityQueue {
    private int[] arr;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // Smaller value = higher priority
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Priority Queue Overflow");
            return;
        }

        int i = size - 1;

        while (i >= 0 && arr[i] > value) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Priority Queue Underflow");
            return -1;
        }

        return arr[--size];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return -1;
        }

        return arr[size - 1];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        System.out.println("Priority Queue elements:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
