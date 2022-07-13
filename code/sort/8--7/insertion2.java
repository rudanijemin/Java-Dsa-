/*8--7
insertion two sorted array====print the value when both are same value */

public class insertion2 {
    static void insertion(int a[],int b[]){
        int i=0;
        int j=0;

        while(i<a.length && j<a.length){
            if(i > 0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
            if(a[i]==a[j]){
                System.out.println(a[i]+" ");
            }else if(a[i]>a[j]){
                j++;
            }else if(a[i]<a[j]){
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2, 2, 5, 6, 6, 8, 8};
		int b[] = {1, 1, 2, 2, 3, 6, 6, 9};
		insertion(a, b);

        for(int e: a) {
			System.out.print(e+" ");
		}
    }
}
