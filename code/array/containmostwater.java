// contain most water 

public class containmostwater {
    static int containmostwater(int a[])
    {
        int maxArea = 0;
        int l=0;
        int r=a.length-1;

        while(l<r)
        {
            int height = Math.min(a[l], a[r]);
            int distance = r-l;
            
            int area = height*distance;
            maxArea = Math.max(maxArea, area);

            if(a[l]<a[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int a[]={1,8,6,3,4,5,8,3,7};
        int ans = containmostwater(a);
        System.out.println(ans);
    }
}
