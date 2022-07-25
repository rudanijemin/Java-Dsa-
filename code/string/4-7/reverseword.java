/*reverse the word the given string
ex==  i am the boss
ans== boss the am i
solution == step 1 -- reverse every word
            step 2 -- reverse whole string */
public class reverseword {

    static void reverseChar(char [] s,int i,int j){
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        
    }
    static String reverseWord(String s){
        char [] c = s.toCharArray();

        int start =0;
        int end=0;

        for(;end<s.length();end++){
            if(c[end] == ' '){
                reverseChar(c, start, end-1);
                start = end+1;
            }
        }
        reverseChar(c, start, end-1); // this call for last word because last word pachi space n hoiii

        reverseChar(c, 0, s.length()-1);  // step 2 ==reverse whole string
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "Never Give Up";
		String ans = reverseWord(s);
		System.out.println(ans);
    }
    
}
