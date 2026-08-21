public class IsEmpty {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        System.out.println("Is priority queue empty? " + queue.isEmpty());

        queue.enqueue(10);

        System.out.println("Is priority queue empty? " + queue.isEmpty());
    }
}
