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

    public static String reverseStr(String s, int k) {

        if(k <= 1) {
            return s;
        }

        if(k > s.length()) {
            return s;
        }

        if(k < s.length() && 2 * k >= s.length()) {
            return reverseStringSeq(s.substring(0, k)) + s.substring(k, s.length());
        }

        if(k == s.length()) {
            return reverseStringSeq(s);
        }

        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer();
        int length = sb.length();
        System.out.println("length: " + length);
        for(int i = 0; i < length; i += 2 * k) {

            int distance = length - i;
            System.out.println("distance: " + distance + ", i: " + i);
            if(distance < k) {
                sb1.append(reverseStringSeq(sb.substring(i, length)));
                System.out.println("< : " + sb);
                break;
            }
            if(distance < 2 * k && distance >= k) {
                sb1.append(reverseStringSeq(sb.substring(i, i + k)) + sb.substring(i + k, length));
                System.out.println("> : " + sb);
                break;
            }

            sb1.append(reverseStringSeq(sb.substring(i, i + k)) + sb.substring(i + k, i + 2 * k));
            System.out.println("= : " + sb1);
        }

        return sb1.toString();
    }

    public static String reverseStringSeq(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseStringII_541.reverseStr("abcdefg", 8));
        //System.out.println(new StringBuffer("abcde").subSequence(0, 1));

    }

}
