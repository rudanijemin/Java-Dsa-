/*left occurence mens left side je pahela ave te ======first occurence
ex int a[]={3,3,5,5,7,7,7,8}
key =7      ans=4 */

public class leftaccu {
    static int leftoccurence(int a[],int key){
        int l=0;
        int r=a.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key){
                ans=mid;
                r=mid-1;
            }
            else if(key>a[mid]) l=mid+1;
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={2,2,4,5,5,5,5,6,7,7,};
        int key=5;
        System.out.println(leftoccurence(a, key));

    }
    
}
