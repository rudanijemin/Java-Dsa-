    /*count occurences 
    retutn ==r.o-l.o+1
    ex=={1,4,6,8,8,8,8,8,9}
    key=8
    ans=5 */

    public class countocc {
        static int leftoccurence(int a[],int key){
            int l=0;
            int r=a.length-1;
            int ans=-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(a[mid]==key){
                    ans=mid;
                    r=mid-1;
                }
                else if(key>a[mid]) l=mid+1;
                else{
                    r=mid-1;
                }
            }
            return ans;
        }
        static int rightoccurence(int a[],int key){
            int l=0;
            int r=a.length-1;
            int ans=-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(a[mid]==key){
                    ans=mid;
                    l=mid+1;
                }
                else if(key>a[mid]) l=mid+1;
                else{
                    r=mid-1;
                }
            }
            return ans;
        }

        
        

        
        
        public static void main(String[] args) {
            int a[]={2,2,3,4,4,4,4,4,6,6,7,8,8,9,9,9,10,11};
            int key=8;
            // System.out.println(leftoccurence(a, key));
            // System.out.println(rightoccurence(a, key));
            int res=rightoccurence(a, key)-leftoccurence(a, key)+1;
            System.out.println(res);

        }
        
    }
