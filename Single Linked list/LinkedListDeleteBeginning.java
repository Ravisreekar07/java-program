public class LinkedListDeleteBeginning {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteBeginning(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
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

        head = deleteBeginning(head);

        display(head);
    }
}
