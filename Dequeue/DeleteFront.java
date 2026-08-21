public class DeleteFront {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertRear(30);

        System.out.println("Deleted from front: " + deque.deleteFront());

        deque.display();
    }
}
