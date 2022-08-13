import java.util.Stack;

public class presl {    
    /*previous smaller element (left side nearest smaller element)
        a[4,10,5,8,20,15,3,12]
        ans = [-1,4,4,5,8,8,-1,3] */
    static int[] prevSmall(int a[]){
        Stack<Integer> s =new Stack<>();
        int ans[] =new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty()  &&  s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
              ans[i]= -1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(a[i]);
        }

        return ans;

    }
    //prev largest element 
    static int[] prevlarge(int a[]){
        Stack<Integer> s =new Stack<>();
        int ans[] =new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty()  &&  s.peek()<=a[i]){ //only this condition change
                s.pop();
            }
            if(s.isEmpty()){
              ans[i]= -1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(a[i]);
        }

        return ans;

    }
    

    //next(right side) smaller element 
    static int[] nextSmall(int a[]){
        Stack<Integer> s =new Stack<>();
        int ans[] =new int[a.length];
        for(int i=a.length-1;i>=0;i--){    //only for loop change element check reverse and check right side
            while(!s.isEmpty()  &&  s.peek()>=a[i]){  //this condition same
                s.pop();
            }
            if(s.isEmpty()){
              ans[i]= -1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(a[i]);
        }

        return ans;

    }
    //next(right) largest
    static int[] nextlarge(int a[]){
        Stack<Integer> s =new Stack<>();
        int ans[] =new int[a.length];
        for(int i=a.length-1;i>=0;i--){    //only for loop change element check reverse and check right side
            while(!s.isEmpty()  &&  s.peek()<=a[i]){  //this condition change
                s.pop();
            }
            if(s.isEmpty()){
              ans[i]= -1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(a[i]);
        }

        return ans;

    }
    public static void main(String[] args) {
        int a[]={4,10,5,8,20,15,3,12};
       // int ans[]  = prevSmall(a); 
       //int ans[]  = nextSmall(a); 
       //int ans[]  = prevlarge(a); 
       int ans[]  = nextlarge(a);
        for(int i=0;i<a.length;i++){
                  
            System.out.println(ans[i]+" ");       

        }
    }
}
