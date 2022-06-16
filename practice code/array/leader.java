/*find the leader element  */
class leader {
    public static void main(String[] args) {
        int a[]={2,5,7,4,1};
        for(int i=0;i<a.length;i++){
            int curr=a[i];
            boolean isLeader= true;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>curr){
                    isLeader=false;
                    break;
                }
                
            }
            if(isLeader)
            {
                System.out.println(a[i]);
            }
        }
       
    }
}
