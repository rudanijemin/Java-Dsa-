

public class secondlarge {
    
    public static int secondlargest(int a[])
    {
        if(a.length<2) return -1;
        
        int largest = 0;
        int secondlargest = -1;


        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[largest])
            {
                secondlargest = largest;
                largest=i;
            }
            else if(a[i]<a[largest])
            {
                if(secondlargest==-1 || a[i]>a[secondlargest])
                {
                    secondlargest=i;
                }
            }   
        }
        return secondlargest;
    

    }
    public static void main(String[] args) {
        int a[]={4,67,4,3,76};

        int index = secondlargest(a);
        System.out.println(a[index]);
        
    }
}
