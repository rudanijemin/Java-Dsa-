

public class merge {
    static void mergeSort(int a[],int l,int h)
    {
        if(l<h){
            int mid =(l+h)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, h);
            merge1(a,l,mid,h);
        }
    }
    static void merge1(int a[],int l,int mid,int h)
    {
        int b[]=new int[a.length];
        int i=l;//i is for left subarray
        int j=mid+1;//j is for right subarray
        int k=l;//k is for b[]

        while(i<=mid && j<=h)
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                i++;
            }else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=h)
            {
                b[k]=a[j];
                k++;j++;
            }
        }else{
            while(i<=mid){
                b[k]=a[i];
                k++; i++;
            }
        }
        for(i=l;i<=h;i++){
            a[i]=b[i];
        }
    }

    public static void main(String[] args) {
        int a[]={4,1,8,6,9,5,7};
        mergeSort(a, 0, a.length-1);
        for(int e: a)System.out.println(e+" ");
    }
    
}
