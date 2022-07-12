/*1/7
swap two bit
ex-- 10101101  index 1 and 5 swap == 10001111 */

public class swaptwobit {
    static int swapbit(int n,int i,int j){
        int ith = (n>>i)&1;
        int jth = (n>>j)&1;

        if(ith == jth) return n;

        int mask = (1<<i)|(1<<j);
        return n^mask;
    }
    public static void main(String[] args) {
        System.out.println(swapbit(10,1,2));
    }
    
}
