public class InsertFront {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.insertFront(30);
        deque.insertFront(20);
        deque.insertFront(10);

        deque.display();
    }
}
