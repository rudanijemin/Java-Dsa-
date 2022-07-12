
/*11--7
quick sort ---partition use i and j chaek (i<j) break */

public class quick {
    static void swap(int a[], int i,int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static int partiton(int a[],int l ,int h){
        int i=l;
        int j=h;
        int pivot =a[l];

        while(i<j){
            while(i<j && a[i]<=pivot)i++;
            while(a[j]>pivot)j--;
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a, l, j);
        return j;
    }
    static void quickSort(int a[],int l,int h){
        if(l<h){
            int pivot = partiton(a, l, h);
            quickSort(a, l, pivot-1);//left side
            quickSort(a, pivot+1, h);//right side
        }
    }
    public static void main(String[] args) {
        int a[]={4,6,9,3,6,1};
        quickSort(a, 0, a.length-1);

        for(int e:a)System.out.println(e+" ");
    }
}
