import java.util.*;

class pair {
    static boolean pairSum(int a[],int sum){
        Set<Integer> set = new HashSet<>();
        for(int e:a){
            int com= sum-e;
            if(set.contains(com)) return true;
            set.add(e);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,1,3,2};
        int sum = 8;
        System.out.println(pairSum(a, sum));
        
    }
    
}
