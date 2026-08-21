public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;

        System.out.println(value + " inserted into queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }

        System.out.println();
    }
}
