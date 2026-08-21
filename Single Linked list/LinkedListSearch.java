public class LinkedListSearch {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int search(Node head, int target) {
        int position = 0;
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return position;
            }

            current = current.next;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int target = 20;
        int position = search(head, target);

        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
