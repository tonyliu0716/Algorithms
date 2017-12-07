package Easy;

/**
 * Created by tonyliu on 2017/12/6.
 *
 *
 *
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 Example:
 Input: s = "abcdefg", k = 2
 Output: "bacdfeg"
 Restrictions:
 The string consists of lower English letters only.
 Length of the given string and k will in the range [1, 10000]
 */
public class ReverseStringII_541 {

    public String reverseStr(String s, int k) {
        StringBuffer sb = new StringBuffer();
        if(s.length() < k) {
            return s;
        }
        int somek = 0;
        while(somek * k < s.length()) {

            sb.append( s.substring(somek * k, (somek + 1) * k));

        }


        return null;
    }

    public static String reverseStringSeq(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
