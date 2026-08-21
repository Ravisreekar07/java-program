public class DeleteFromEnd {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Before deletion:");
        list.display();

        list.deleteFromEnd();

        System.out.println("After deletion:");
        list.display();
    }
}
