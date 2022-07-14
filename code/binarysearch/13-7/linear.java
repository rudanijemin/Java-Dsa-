

public class linear {
    static int linearsearch(int a[],int key){
        
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={7,8,3,7,9,2,6};
        int key=6;
      
        System.out.println(linearsearch(a, key));
    }
    
}
