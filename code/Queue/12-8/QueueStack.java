import java.util.Stack;

/*implement Queue using two stack */
import java.util.*;
public class QueueStack{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int data){
        s1.push(data);
    }
    int pop(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        QueueStack q = new QueueStack();
        q.push(10);
        q.push(20);
        System.out.println(q.pop());
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.pop());


    }
}
