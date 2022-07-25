public class squrt {
    static int sq(int x){
        int l=0;
        int r=x;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            int midsqr = mid*mid;
            if(midsqr==x) return mid;

            if(midsqr>x) r=mid-1;
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sq(50));
    }
    
}
