/*infix to postfix 
a+b=ab+
4 case handle == 1-(    2-)    3-operator    4-oprands    */
import java.util.ArrayDeque;
public class postfix {
    static boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/';
    }

    static int parecedance(char c){
        if(c=='+'||c=='-')return 1;
        else if(c=='*'||c=='/') return 2;
        else return -1;
    }
    static int cal(int a,int b,char c){
        switch (c) {
        case '+':
                return a+b; // return se loop ni jj bahar nikali javi etle brack ni bahar nikali jvi
        case '-':
                return a-b;
        case '*':
                return a*b;
        case '/':
                return a/b;    
        }
        return 0;
    }

    static String infixToPostfix(String s){
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);

            //1 case (
            if(cur == '('){
                stack.push(cur);
            }
            else if(cur== ')'){
                while(stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();//stack mathi badha element pop thai jai pchi "(" open bracket baahr nikalava use thase 
            }
            else if(isOperator(cur)){
                while(!stack.isEmpty() &&
                            parecedance(cur)<=parecedance(stack.peek())){
                                sb.append(stack.pop());
                            }
                            stack.push(cur); //condition false or true pade tyre cur element stack ma push thse
            }
            else{
                sb.append(cur);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();

    }
    static int evaluate(String s){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(isOperator(cur)){
                int second = stack.pop();
                int first = stack.pop();
                int eval = cal(first,second,cur);
                stack.push(eval);

            }
            else{
                stack.push(cur-'0');
            }
        }
        return stack.pop();//last result pop karvi devanu

    }


    public static void main(String[] args) {
        	
            String input = "(2*3)-(4/5-6+7)";
            String output=infixToPostfix(input);
            System.out.println(output);

           
            int eval=evaluate(output);
            System.out.println(eval);



    }
}
