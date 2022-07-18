/*Find the upper bound of an element in a sorted Array (upper bound of an element is the
next greater element)
{2,5,6,8,33,56,66,78,88}
ans==78.*/

/*binary search array is sorted */

class uperbound {
    static int binarysearch(int a[]){
        int l=0;
        int r=a.length-1;
        int n=a.length-2;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==a[n]) return a[mid];
            if(a[n]>a[mid]) l=mid+1;
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={3,4,6,8,9,66,89};
        
        System.out.println(binarysearch(a));

    }
    
}
