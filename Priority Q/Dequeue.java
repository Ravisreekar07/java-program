public class Dequeue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        queue.enqueue(30);
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("Removed element: " + queue.dequeue());

        queue.display();
    }
}
