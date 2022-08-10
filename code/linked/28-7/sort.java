class sort{
    static void printLL(Node head){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data+" -> ");
			cur = cur.next;
        }
        System.out.println("end");

        static Node sortList(Node head) {
        
            Node middle(Node head){
                Node slow=head;
                Node fast=head.next;
                
                while(fast!=null &&  fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow;
            }
            
            Node mearge(Node left,Node right){
                if(left==null){
                    return right;
                }
                if(right==null){
                    return left; 
                }
                Node ans =new Node(-1);
                Node temp=ans;
                
                //mearge 2 ll
                while(left!=null && right!=null){
                    if(left.val<=right.val){
                        temp.next=left;
                        temp=left;
                        left=left.next;
                    }
                    else{
                        temp.next=right;
                        temp=right;
                        right=right.next;
                    }
                }
                if(left!=null){
                    temp.next=left;
                    temp=left;
                    left=left.next;
                }
                if(right!=null){
                    temp.next=right;
                    temp=right;
                    right=right.next;
                }
                ans=ans.next;
                return ans;
            }
            
            //base case
            if(head== null || head.next==null){
                return head;
            }
            //break link list after find mid
            Node mid=middle(head);
            Node left=head;
            Node right = mid.next;
            mid.next=null;
            
            //recursion call both have
            left=sortList(left);
            right= sortList(right);
            
            //mearge both left and right
            Node result=mearge(left,right);
                
            return result;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(50);
        Node n2 = new Node(20);
        Node n3 = new Node(80);
        Node n4 = new Node(35);

        Node head= n1;
        n1.next=n2;
        n2.next = n3;
        n3.next = n4;
        printLL(head);
        h=sort
    }
}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}