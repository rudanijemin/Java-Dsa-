/*implement queue using linked list */

public class QueueLl {
    node front ,rear;
    void enqueue(int data){
        node nn = new node(data);
        if(isEmpty()){
            front = rear=nn;
            return;
        }
        rear.next=nn;
        rear=nn;
    }


    boolean isEmpty(){
        return front == null;
    }
    int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("queue is empty");
        int ans = front.data;
        front= front.next;
        return ans;
    }

    public static void main(String[] args) throws Exception {
        QueueLl q=new QueueLl();
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(60);
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        

    }
    
}
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
    }
}
