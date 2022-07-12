/*8/7
insertion sortx */


public class insertion {
    static void insertionsort(int a[]){
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int temp=a[i];
            for(;j>=0;j--){
                if(temp<a[j]){
                    a[j+1]=a[j];
                }else{
                    break;
                }
            }
            a[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {9, 5, 2, 6, 3, 1, 3};
        insertionsort(a);
        for(int e: a) {
			System.out.print(e+" ");
		}
    }
    
}
