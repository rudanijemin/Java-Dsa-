/*max area in submatrix */

public class maxsub {

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
    static int maxarea(int a[][]){
        int b[] = new int[a[2].length];
        int max=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i][j]==0){
                    b[j]=0;
                }else{
                    b[j]++;
                }
            }
            int cur = m
        }

    }
    
}
