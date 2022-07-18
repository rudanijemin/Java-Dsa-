/*search an element in an infinite sorted array
you are does not find last element because last element is infinite 
solution == rang double karti javi ...and element find karvo*/

public class infinit {
    static int binarysearch(int a[],int key,int l,int r){
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid] == key) return mid;
			if(key > a[mid]) l = mid+1;
			else r = mid-1;
        }
        return -1;
    }

    static int searchInfinitArray(int a[],int key){
        if(a.length==0) return -1;
        if(a[0]==key) return 0;
        int index =1;
        while(a[index]<=key){
            index *=2;
        }
        return binarysearch(a,key,index/2,index);
    }
    public static void main(String[] args) {
        int a[]={1,3,5,7,9,12,14,18,24,35,45,56,68,69,74,77,79,83,84,88,89,92,94,95,97,98,99};
        int key=14;
        System.out.println(searchInfinitArray(a, key));
    }
    
}
