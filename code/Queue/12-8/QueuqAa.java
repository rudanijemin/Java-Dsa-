/*implement queue using Array */
 

public class QueuqAa {
    int rear;
    int a[];
    int n;
    QueuqAa(int n){
        rear=-1;
        a=new int[n];
        this.n=n;
    }
    void enqueue(int data) throws Exception{
        if(isfull()) throw new Exception("array is a full");
        rear++;
        a[rear]=data;

    }
    int dequeue()throws Exception{
        if(isEmpty()) throw new Exception("Queue is Empty");
        int ans = a[0]; // front is always 0
        for(int i=0;i<rear;i++){
            a[i]=a[i+1];
        }
        rear--;
        return ans;

    }
    boolean isfull(){//full condition cheack karvi pde because array size limitted hoi
        return rear==n-1;
    }
    boolean isEmpty(){
        return rear ==-1;
    }
    public static void main(String[] args)throws Exception {
        QueuqAa q = new QueuqAa(4);
        q.enqueue(90);
        q.enqueue(50);
        q.enqueue(40);
        q.enqueue(80);
        System.out.println(q.dequeue());

        

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}
