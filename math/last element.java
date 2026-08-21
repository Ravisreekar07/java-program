class Main{
    static class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    static NoderemovelastNode(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return head;
    }
}