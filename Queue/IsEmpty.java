public class IsEmpty {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue(10);

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
