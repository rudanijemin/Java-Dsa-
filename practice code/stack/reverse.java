import java.util.ArrayDeque;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        ArrayDeque<Character> s = new ArrayDeque<>();
        String str ="jemin";
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        
        while(!s.isEmpty()){
            // char ch=s.peek();
            
            // s.pop();
            System.out.print(s.pop());
        }
        
    }
    
}
