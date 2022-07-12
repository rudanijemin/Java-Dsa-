/*trapping rain water
find store water?
 */

public class trapingwater {
    static int trappingRainWater(int a[]){
        int ans=0;
        int leftmax=0, rightmax=0;
        int l=0,r=a.length-1;

        while(l<r){
            if(a[l]<=a[r]){
                if(a[l]>leftmax) leftmax=a[l];
                else ans+=(leftmax-a[l]);
                l++;
            }
            else{
                if(a[r]>rightmax) rightmax=a[r];
                else ans+=(rightmax-a[r]);
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int a[]={3,4,5,1,7,2,6,5,4,1};
        int ans=trappingRainWater(a);
        System.out.println(ans);
        
    }
    
}
