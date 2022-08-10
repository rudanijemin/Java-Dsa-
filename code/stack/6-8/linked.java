import java.util.*;

/*linked list implimentation stack */

public class linked{
    static node head = null;

    static boolean isEmpty(){
        return head==null;
    }
    static int pop(){
        if(isEmpty()){
            return -1;
        }
        node top=head;
        head=head.next;
        return top.data;
    }
    static void push(int data){
        node newNode = new node(data);
        if(head==null){
            head = newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    static int peek(){
        if(isEmpty()) {
            return -1;
        }
        node top = head;
        return top.data;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
