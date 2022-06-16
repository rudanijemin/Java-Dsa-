
public class maxsumsubarray {
    static int largestsumsubarray(int a[])
    {
        int currSum =0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            currSum +=a[i];
            if(maxSum<currSum)
            {
                maxSum=currSum;
            }
            if(currSum<0){
                currSum =0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int a[]={6,-7,4,-2,1,5,-4};
        int ans = largestsumsubarray(a);
        System.out.println(ans);
    }
    
}
