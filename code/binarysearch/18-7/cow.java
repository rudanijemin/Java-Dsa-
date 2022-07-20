/*aggressive cow
Given an array of length ‘N’, where each element denotes the position of a stall.
 Now you have ‘N’ stalls and an integer ‘K’ which denotes the number of cows that are aggressive. 
 To prevent the cows from hurting each other, you need to assign the cows to the stalls,
such that the minimum distance between any two of them is as large as possible. Return the largest minimum distance.*/
import java.util.Arrays;
public class cow {
    static boolean isPossiable(int stall[],int k,int mid,int n){
        int cowcount=1;
        int laspos=stall[0];
        for(int i=0;i<n;i++){
            if(stall[i]-laspos>=mid){
                cowcount++;
                if(cowcount==k){  //that means given question all cow place
                    return true;
                }
                laspos=stall[i];
            }
        }
        return false;
    }

    static  int aggressive(int stall[],int k){
        Arrays.sort(stall);
        int l=0;
        int n=stall.length;
        int r = stall[n-1];  // value is maximum because stall ko sorted kar diya ....stall(n-1) se last element find
        int ans =-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(isPossiable(stall,k,mid,n)){
                ans=mid;
                l=mid+1;  // check right side of stall
            }
            else{
                r=mid-1;
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args) {
        int stall[]={1,2,4,8,9};
        int n=stall.length;
        int k=3;
        System.out.println(aggressive(stall, k));
        
    }
    
}
