public class Peek {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        queue.enqueue(30);
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("Highest priority element: " + queue.peek());
    }
}
