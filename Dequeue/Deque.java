public class Deque {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Deque(int capacity) {
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

    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque Overflow");
            return;
        }

        front = (front - 1 + arr.length) % arr.length;
        arr[front] = value;

        if (size == 0) {
            rear = front;
        }

        size++;
    }

    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque Overflow");
            return;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = value;

        if (size == 0) {
            front = rear;
        }

        size++;
    }

    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return value;
    }

    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return -1;
        }

        int value = arr[rear];
        rear = (rear - 1 + arr.length) % arr.length;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return value;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        return arr[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }

        System.out.println();
    }
}
