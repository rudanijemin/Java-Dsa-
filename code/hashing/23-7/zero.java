import java.lang.Thread.State;
import java.util.*;

/*zero sum subarray */

class zero {
    static boolean zerosum(int a[]){
        Set<Integer> set = new HashSet<>();
        int cs=0;
        for(int e:a){
            cs+=e;
            if(set.contains(cs))return true;
            set.add(cs);
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,4,-3,2,1,2};
        System.out.println(zerosum(a));
    }
    
}
