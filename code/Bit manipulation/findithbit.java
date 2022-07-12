/*30/6
find ith bit */

public class findithbit {
    int findbit(int n,int i){
        int mask=1<<i;

        int result = n&mask;
        if(result == 0)return 0;
        else return 1;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(findhbit(n,3));
        
    }
    
}
