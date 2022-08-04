
/*find the kth element from last in a linked list
linked list = 10,20,30,40,50,60
k=2 ans 50
k=3 ans 40
*/
class insert {
    static void printLL(node<Integer> head){
        node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" -> ");
            cur=cur.next;
        }
        System.out.println("end");
    }


    //remove dublicate
    static node<Integer> remove(node<Integer> head){
        
        //if(!head) return null;
        while(head.next!=null){
            if(head.data ==head.next.data){
                head.next=head.next.next;
            }
            else{
                head=head.next;
            }
            
        }
        return head;
    }
        

    

    //kth last element
    static int kth(int k,node<Integer> head){
        
        node<Integer> s = head;
        node<Integer> f = head;

        for(int i=0;i<k;i++){
            f=f.next;
        }
        while(f!=null){
            s=s.next;
            f=f.next;
        }
        return s.data;
    }
    public static void main(String[] args) {
        node<Integer> n1 = new node<>(10);
        node<Integer> n2 = new node<>(20);
        node<Integer> n3 = new node<>(20);
        node<Integer> n4 = new node<>(30);
        

        node<Integer> head =n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        printLL(head);
        //System.out.println(kth(3, head));
        System.out.println(remove(head));

    }
    
}
class node<t>{
    t data;
    node<t> next;
    node(t data){
        this.data=data;
    }
}
