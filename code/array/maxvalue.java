/*given an array arr[],
find the maximum j-i such that arr[j]>arr[i]
find max distance j-i
 */

public class maxvalue {
    static int maxvalueofjminusi(int a[]){
        int n=a.length;
        int rightmax[]=new int[n];
        int leftmin[]=new int[n];

        rightmax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], a[i]);
        }
        leftmin[0]=a[0];
        for(int i=1;i<n;i++){
            leftmin[i]=Math.min(leftmin[i-1], a[i]);
        }

        int i=0,j=0;
        int ans=0;
        while(i<n && j<n){
            if(leftmin[i]<rightmax[j]){
                ans=Math.max(ans,j-i);
                j++;
            }else{
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={3,5,1,4,2,1};

        System.out.println(maxvalueofjminusi(a));


        
    }
    
}
