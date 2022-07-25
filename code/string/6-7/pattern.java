/*parten matching algorithm-naive */

public class pattern {
    static void  patternMatching(String s , String p){
        int n=s.length();
        int m= p.length();
        for(int i=0;i<n-m;i++){
            int j=0;
            for(;j<m;j++){
                if( s.charAt(i+j)!=p.charAt(j) ){
                    break;
                }
            }
            if(j==m){
                System.out.println("matching string index of "+i);
            }
        }
    }
    public static void main(String[] args) {
        String s ="kmhrpyotgjbv";
        String p="pyo";
        patternMatching(s, p);
    }
    
}
