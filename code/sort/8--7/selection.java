

public class selection {
    
	static void swap(int a[], int min, int i) {
		int temp = a[min];
		a[min] = a[i];
		a[i] = temp;
	}
    static void selectionsort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            swap(a,min,i);
        }
    }
    public static void main(String[] args) {
        int a[] = {9, 5, 2, 6, 3, 1, 3};
        selectionsort(a);
        for(int e: a) {
			System.out.print(e+" ");
		}
    }
    
}
