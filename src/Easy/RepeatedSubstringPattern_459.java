package Easy;

/**
 * Created by tao on 5/23/18.
 *
 * Given a non-empty string check if it can be constructed by taking a substring
 * of it and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 Example 1:
 Input: "abab"

 Output: True

 Explanation: It's the substring "ab" twice.
 Example 2:
 Input: "aba"

 Output: False
 Example 3:
 Input: "abcabcabcabc"

 Output: True

 Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class RepeatedSubstringPattern_459 {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 1; --i) {
            if (n % i == 0) {
                // c: how many times
                int c = n / i;
                StringBuffer t = new StringBuffer();
                for (int j = 0; j < c; ++j) {
                    t.append(s.substring(0, i));
                }
                System.out.println(t);
                if (t.toString().equals(s)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern_459 sub = new RepeatedSubstringPattern_459();
        System.out.println(sub.repeatedSubstringPattern("abaababaab"));

    }

}
