

/*Generate subsequence of a string */

public class subsequence {
    static void generateAllSubset(String s){
        utilGenerateAllSubset(s, 0, " ");


    }
    static void utilGenerateAllSubset(String s ,int i, String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        utilGenerateAllSubset(s, i+1, cur);
        utilGenerateAllSubset(s, i+1, cur+s.charAt(i));


    }
    public static void main(String[] args) {
        generateAllSubset("abc");
    }
    
}
