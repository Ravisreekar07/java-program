class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data = new_data;
        this.next = null;
    }
}
class Main{
    static Node insertAtFront(Node head, int x){
        Node new_node = new Node(x);
        new_node.next = head;
        head = new_node;
        return head;
    }
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head = null;
        Node new_node = new Node(2);
        head = new_node;
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        int x = 1;
        head = insertAtFront(head, x);
        printList(head);
    }