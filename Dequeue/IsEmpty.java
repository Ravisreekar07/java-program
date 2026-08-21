public class IsEmpty {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        System.out.println("Is deque empty? " + deque.isEmpty());

        deque.insertRear(10);

        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
