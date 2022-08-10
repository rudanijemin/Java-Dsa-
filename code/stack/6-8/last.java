import java.util.Stack;

/*element add in a last
using collection fream work 
*/
import java.util.*;

public class last {
    //add bottom of the stack
    static  void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp=s.pop();
        pushBottom(s, data);
        s.push(temp);


    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s, 5);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    
    
}
