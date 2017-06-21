package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by tonyliu on 6/20/17.
 *
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:

 Input:
 "abccccdd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 *
 */
public class LongestPalindrome409 {

    public int longestPalindrome(String s) {
        int longestLength = 0;
        if (s == null) return longestLength;
        Set<Character> characterSet = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (characterSet.contains(character)) {
                characterSet.remove(character);
                longestLength += 2;
            } else {
                characterSet.add(character);
            }
        }
        return (characterSet.size() > 0) ? longestLength + 1 : s.length();
    }


    public static void main(String[] args) {
        LongestPalindrome409 longestPalindrome409 = new LongestPalindrome409();
        int val = longestPalindrome409.longestPalindrome("AaA");
        System.out.println(val);
    }

}
