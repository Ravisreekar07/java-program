class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}class Main{
    static Node insert pos (Node head, int pos, int value){
        Node newNode = new Node(value);
       {
        if(pos<1)
        return head;
        if(pos==1){
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for(int i=1; i<pos-1 && curr!=null; i++){
            curr = curr.next;
        }if(curr==null)
            return head;
            Node newNode = new Node(value);
            newNode.next = curr.next;
            curr.next = newNode;
        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            if (curr.next!=null){
              System.out.print("-> ");    
            }
            curr = curr.next;
        }
        system.out.println();
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int pos = 3;
        int value = 10;
        head = insert pos(head, pos, value);
        printList(head);
    }

}