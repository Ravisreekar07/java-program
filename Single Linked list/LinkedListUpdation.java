public class LinkedListUpdation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean update(Node head, int oldValue, int newValue) {
        Node current = head;

        while (current != null) {
            if (current.data == oldValue) {
                current.data = newValue;
                return true;
            }

            current = current.next;
        }

        return false;
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

        update(head, 20, 25);

        display(head);
    }
}
