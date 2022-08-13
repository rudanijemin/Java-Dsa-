/*minstack using o(n) space 
stack =55,7,41,96,32,2,5
ans =2  min ans find karvo */


import java.util.ArrayDeque;

public class minstack {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
	ArrayDeque<Integer> minStack = new ArrayDeque<>();

    void push(int e){
        stack.push(e);
        if(minStack.isEmpty()){
            minStack.push(e);
            return;
        }
        if(e<=minStack.peek()){
            minStack.push(e);
        }
    }
    int pop() throws Exception{
        if(stack.isEmpty()) throw new Exception("stack is empty");
        int ans = stack.pop();

        if(ans == minStack.peek()){
            minStack.pop();
        }
        return ans;
    }
    int min() throws Exception{
        if(stack.isEmpty()) throw new Exception("stack is empty");
        return minStack.peek();


    }
    public static void main(String[] args) throws Exception {
        minstack mi = new minstack();
        mi.push(10);
        mi.push(8);
        mi.push(15);
        mi.push(5);
        System.out.println(mi.min());
        mi.pop();
        System.out.println(mi.min());
        mi.push(4);
        System.out.println(mi.min());



    }
}
