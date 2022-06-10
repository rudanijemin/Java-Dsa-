

public class largest1 {
    
    public static int largest(int a[])
    {
        if(a.length==0) return -1;
        int max =0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[max])
            {
                max=i;
                
            }
        }
        return max;
        


    }
    public static void main(String[] args) {
        int a[]={2,7,85,66,52,41,402};
        
        int index = largest(a);
        System.out.println(a[index]);
     
       
         
    }
}
