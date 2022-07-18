/* Find the first position of 1 in a sorted array containing only 0s and 1s 
{0,0,0,0,0,1,1,1,1}ans 5*/

public class first1{
    static int firstpo1(int a[]){
        int l=0;
        int r=a.length-1;
        int ans = -1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==1) {
                ans=mid;
                r=mid-1;
            }
         
            else{
                l=mid+1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={0,0,0,0,0,0,0,1,1};
        System.out.println(firstpo1(a));
        
    }
    
}
