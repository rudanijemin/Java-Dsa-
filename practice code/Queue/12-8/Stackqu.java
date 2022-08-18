import java.util.*;

/*implement stack using two queue
ans
implement stack using single queue
*/

class Stackqu {
    // static Queue<Integer> q1 = new LinkedList<Integer>();
    // static Queue<Integer> q2 = new LinkedList<Integer>();
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    // void push(int data){
    //     while(!q1.isEmpty()){
    //         q2.add(q1.remove());
    //     }
    //     q1.offer(data);
    //     while(!q2.isEmpty()){
    //         q1.add(q2.remove());
    //     }
    // }
    // int pop(){
    //     return q1.remove();
    // }
     
    //2 . method

    //   void push(int data){
    //     q2.add(data);
    //     while(!q1.isEmpty()){
    //         q2.add(q1.remove());
    //     }
    //     Queue<Integer> q =q1;
    //     q1=q2;
    //     q2=q;

    // }
    // int pop(){
    //     return q1.remove();
    // }


    //using single queue
    
    void push(int data){
        q1.add(data);
        
        for(int i=0;i<q1.size()-1;i++){
            q1.add(q1.remove());
        }
    }
    int pop(){
        return q1.remove();
    }

    
    public static void main(String[] args) {
        Stackqu s = new Stackqu();

        s.push(10);
        s.push(20);
        s.push(70);
        System.out.println(s.pop());
        s.push(43);
        System.out.println(s.pop());
    }
    
}
