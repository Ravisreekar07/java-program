public class LinkedListNodeInsertion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

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

        head = insertAtPosition(head, 25, 2);

        display(head);
    }
}
