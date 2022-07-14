/*binary search array is sorted */

public class binary {
    static int binarysearch(int a[],int key){
        int l=0;
        int r=a.length-1;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key) return mid;
            if(key>a[mid]) l=mid+1;
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={3,4,6,8,9,66,89};
        int key=66;
        System.out.println(binarysearch(a, key));

    }
    
}
