/*array is sorted or not */


public class arrayissorted {

    static boolean isSorted(int a[])
    {
        //base case
        if(a==null || a.length<1)
        {
            return true;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={3,2,7,5,9,4,6};
        System.out.println(isSorted(a));


    }
}
