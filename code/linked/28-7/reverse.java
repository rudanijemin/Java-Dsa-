class reverse {
    static void printLL(Node head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+" -> ");
			cur = cur.next;
        }
        System.out.println("end");
    }
    static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node temp=head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head= n1;
        n1.next=n2;
        n2.next = n3;
        n3.next = n4;
        printLL(head);
        head = reverse(head);
        printLL(head);
    }
    
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}
