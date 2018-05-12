package Easy;

/**
 * Created by tao on 5/12/18.
 * We are given two strings, A and B.

 A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
 For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
 Return True if and only if A can become B after some number of shifts on A.

 Example 1:
 Input: A = 'abcde', B = 'cdeab'
 Output: true

 Example 2:
 Input: A = 'abcde', B = 'abced'
 Output: false
 Note:

 A and B will have length at most 100.
 */
public class RotateString_796 {

    public boolean rotateString(String A, String B) {
        if(A.equals(B)) {
            return true;
        }
        if(A.length() != B.length()) {
            return false;
        }
        StringBuffer sb = new StringBuffer(A);
        for(int i = 0; i < A.length(); i++) {
            char first = sb.charAt(0);
            sb = sb.deleteCharAt(0).append(first);
            if(sb.toString().equals(B)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String A = "abcde";
        String B = "abced";
        RotateString_796 strings = new RotateString_796();
        System.out.println( strings.rotateString(A, B) );
    }

}
