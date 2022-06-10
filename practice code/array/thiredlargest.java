

public class thiredlargest {

    static int thiredlarge(int a[],int n)
    {
        
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[n-3];
    }
    public static void main(String[] args) {
        int a[]={3,67,98,22,56,90};
        System.out.println("thired largest element = "+thiredlarge(a,6));

        
    }
    
}
