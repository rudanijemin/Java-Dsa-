/*find the sum of digit in a number
ex=2314 
ans=2+3+1+4=10 */

public class findsum {
    static int sum(int n){
        //base case
        if(n==0) return 0;
        int lastdigit =n%10;
        return lastdigit + (sum(n/10));
    }
    public static void main(String[] args) {
        System.out.println(sum(2314));
        
    }
    
}
