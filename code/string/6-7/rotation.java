/*check if string are rotations 
abcd==cdab */

public class rotation {
    static boolean rotationalStrings(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		String doubleString = s1+s1;
		return doubleString.contains(s2);
	}
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abced";
        System.out.println(rotationalStrings(s1, s2));
    }
}
