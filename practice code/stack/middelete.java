import java.util.Stack;

public class middelete {
    static void delete(Stack<Integer>s,int count ,int size){

        //base case
        if(size/2==count){
            s.pop();
            return;
        }

        int num=s.peek(); //top element num store kare because return ma top print karvanu 
        s.pop();

        //recursion call
        delete(s, count+1, size);
        s.push(num);

    }
    public static void main(String[] args) {
        int count =0;
        int n = 
        System.out.println(delete(s, count, n));
    }
    
}
