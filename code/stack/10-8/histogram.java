import java.util.ArrayDeque;
import java.util.Stack;

/*find max the area of histogram 
solution = width*hight
width = (r-l-1)
r=index of next small
l=index of previous small
*/

public class histogram {
    /*previous smaller */
    static int[] previous(int a[]){
        int ans[]=new int[a.length];
        ArrayDeque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(i);//push index karvani
        }
        return ans;
    }
    /*next smaller */
    static int[] next(int a[]){
        int ans[]=new int[a.length];
        ArrayDeque<Integer> s = new ArrayDeque<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=a.length;
            }else{
                ans[i]=s.peek();
            }
            s.push(i); //push index karavni
        }
        return ans;
    }

    static int max(int a[]){
        int ps[]=previous(a);
        int ns[]=next(a);

        int max=0;
        for(int i=0;i<a.length;i++){
            int width=ns[i]-ps[i]-1;
            int cuuarr=a[i]*width;
            max=Math.max(max, cuuarr);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {4, 3, 9, 2, 5, 1, 8, 3};
        System.out.println(max(a));
    }


}
