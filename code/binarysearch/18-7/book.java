/*book allocation problem 
Given number of pages in n different books and m students. 
The books are arranged in ascending order of number of pages. 
Every student is assigned to read some consecutive books.
 The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.  */

public class book {
    //n is a pages
    //m is a student
    static boolean isPosibile(int a[],int n,int m,int mid){
        int studencount =1;
        int pageSum = 0;

        for(int i=0;i<n;i++){
            if(pageSum+a[i]<=mid){
                pageSum+=a[i];
            }
            else{
                studencount++;
                if(studencount > m || a[i]>mid){
                    return false;
                }
                pageSum = a[i];
            }
            if(studencount>m){
                return false;
            }
        }
        return true;
    }


    static int allocation(int a[],int n,int m){
        int l=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int r=sum;
        int ans = -1;
        while(l<=r){
            int mid =(l+r)/2;
            if(isPosibile(a,n,m,mid)){
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
        int a[]={12,34,67,90};
        int m=2;
        int n=a.length;
        System.out.println("minimin number of pages="+allocation(a, n, m));
    }
}
