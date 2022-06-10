
/*smallest element in java */

class smallestelm{
    static int smallest(int a[])
    {
        if(a.length==0) return -1;

        int min = 0;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[min])
            {
                min = i;
            }

        }
        return min;


    }

    public static void main(String[] args) {
        int a[]={2,4,6,8,9,1};

        int c=smallest(a);
        System.out.println(a[c]);
    }


}