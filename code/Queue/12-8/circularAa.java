/*implement queue using circular Array */

public class circularAa {
    int front, rear;
	int a[];
	int n;

	circularAa(int n) {
		front = rear = -1;
		a = new int[n];
		this.n = n;
	}
    void enqueue(int data)throws Exception{
        if(isFull()) throw new Exception("Queue Array is Full");
        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%n;
        a[rear]=data;
    }
    int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("Queue Array is Empty");
        if(front == rear) { // to check if one element only
			int ans = a[front];
			front = -1;
			rear = -1;
			return ans;
		}
		int ans = a[front];
		front = (front+1) % n;
		return ans;
    }
    boolean isFull(){
        return (rear+1)%n == front;
    }
    boolean isEmpty(){
        return front == -1;
    }
    public static void main(String[] args) throws Exception{
        circularAa c = new circularAa(3);
        c.enqueue(60);
        c.enqueue(90);
        System.out.println(c.dequeue());
        c.enqueue(20);
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());




    }
    
}
