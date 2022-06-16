/*leader element := the element which do not have any larger element on their right side */

public class leader {
    static void leaderinArray(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>largest){
                largest=a[i];
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int a[]= {2,8,5,6,3,1};
        leaderinArray(a);
    }
}
