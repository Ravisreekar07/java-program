public class LinkedListNodeDeletion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteAtPosition(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 0) {
            return head.next;
        }

        Node current = head;

        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return head;
        }

        current.next = current.next.next;

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteAtPosition(head, 2);

        display(head);
    }
}
