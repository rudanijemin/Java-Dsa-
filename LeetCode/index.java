import java.io.*;
 
class index{
    static int pos(int a[],int key){
        int l=0;
        int r=a.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key) return mid;
            else if(a[mid]<key) l=mid+1;
            else r=mid-1;
        }
        return r+1;
    }
    public static void main(String[] args) {
        int a[]={1,3,5,6};
        int key=7;
        System.out.println(pos(a, key));
    }
}