/*anagram ==1 : a word or phrase made by transposing the letters of another word or phrase 
The word "secure" is an anagram of "rescue."  */
import java.util.Arrays;
public class anagram {

    // first solution
    // static boolean anagram(String s1,String s2){
       
    //     char c1[]=s1.toCharArray();
    //     Arrays.sort(c1);

    //     char c2[]=s2.toCharArray();
    //     Arrays.sort(c2);

    //     if(c1==c2){return true;} 

    //     else {return false;}
    // }


    //second solutin
    static boolean anagram(String s1,String s2){
        int a[]=new int[256];  //koi pn array ni frequency 256 ... because that decided ASCII value
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)]++;
        }
       
		for(int i = 0; i<s2.length(); i++) {
			a[s2.charAt(i)]--;
		}
		
        for(int e: a) {
			if(e != 0) return false;
		}
		return true;
    }

    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(anagram(s1, s2));
    }
}
