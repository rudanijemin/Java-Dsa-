
/*insert in linked list */

class insert {
    static void printLL(Node<Integer> head){
        Node<Integer> cur = head;
        while(cur != null){
            System.out.print(cur.data+" -> ");
			cur = cur.next;
        }
        System.out.println("end");
    }

    //insert
    static Node<Integer> insertLL(int data,int pos ,Node<Integer>head){
        Node<Integer> newNode = new Node<>(data);
        if(pos == 0){
            newNode.next = head;
            head=newNode;
            return head;
        }
        Node<Integer> cur = head;  
        for(int i=0;i<pos-1;i++){
            cur=cur.next;
            if(cur==null) return head;
        }
        newNode.next=cur.next;
        cur.next=newNode;
        return head;
    }


    //delete
    static Node<Integer> deleteL(int pos,Node<Integer>head){
        if(head==null) return null;
        if(pos==0){
            head=head.next;
            return head;
        }
        Node<Integer> cur = head;  
        for(int i=0;i<pos-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
    //delete without using head
    static void deleteWh(Node<Integer> node){
        if(node.next!=null){
            node.data=node.next.data;
            node.next=node.next.next;
        }
        System.out.println(node);

    }

    //middle
    static int middle(Node<Integer> head){
        Node<Integer> slow = head;
		Node<Integer> fast = head;

        while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
        return slow.data;
    }
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        Node<Integer> head= n1;
        n1.next=n2;
        n2.next = n3;
        n3.next = n4;

        printLL(head);
        // head = insertLL(100, 3, head);
       // head = deleteL(2, head);
        //   head = middle(head);
        // printLL(head);
       // System.out.println(middle(head));
        node = deleteWh(3);
        deleteWh(node);



    }
   

    
}
class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data=data;
    }
}
