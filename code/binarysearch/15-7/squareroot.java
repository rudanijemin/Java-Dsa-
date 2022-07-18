/*find the square root of an integer
without using linearsearch  */


public class squareroot {

    //linear search   tc=O(n)
    // static int squrt(int n){
    //     int i=0;
    //     for(;i*i<=n;i++){
    //         if(i*i==n) return i;
    //     }
    //     return i-1;
    // }

    //binary search     tc=o(logn)
    static int squrt(int n){
        int ans=1;
        int l=1;
        int r=n;
        while(l<=r){
            System.out.println(l+" "+r);
            int mid=(l+r)/2;
            int midsqr = mid*mid;
            if(midsqr==n)return mid;
            if(midsqr>n) r=mid-1;
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squrt(50));
    }
    
}
