/*find two number in a sorted array with the given sum
 */

public class twosum {

    static boolean twoSum(int a[],int sum){
        
        int l=0;//zero index
        int r=a.length-1;//last index

        while(l<r){
            int cursum=a[l]+a[r];
            if(cursum>sum){
                r--;
            } 
            else if(cursum<sum){
                l++;
            } 
            else{
                return true;
            } 
        }

        return false;

        
    }
    public static void main(String[] args) {
        int a[]={1,2,7,8,10,12};
        int sum=15;
        System.out.println(twoSum(a,sum));
        
    }
    
}
