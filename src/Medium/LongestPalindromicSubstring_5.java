package Medium;

/*
*   5. Longest Palindromic Substring
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
* */

import java.util.ArrayList;

public class LongestPalindromicSubstring_5 {


    // brute force:
    public String longestPalindrome(String s) {
        if(isPalindrome(s)) {
            return s;
        }

        String longest = "";
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                sb.append(s.substring(i, j + 1));
                if(isPalindrome(sb.toString()) && sb.length() > max) {
                    longest = sb.toString();
                    max = sb.length();
                }
                sb.setLength(0);
            }
        }

        return longest.length() == 0 ? String.valueOf(s.charAt(0)) : longest;
    }

    // use dynamic programming -> checking the center, then expand it to left and right
    public String longestPalindrome2(String s) {
        String res = "";
        int resLength = 0;

        for(int i = 0; i < s.length(); i++) {
            // odd length
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 > resLength) {
                    res = s.substring(left, right + 1);
                    resLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }

            // even length
            left = i;
            right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 > resLength) {
                    res = s.substring(left, right + 1);
                    resLength = right - left + 1;
                }
                left -= 1;
                right += 1;

            }

        }

        return res;
    }

    public boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring_5 sub = new LongestPalindromicSubstring_5();
        System.out.println(sub.longestPalindrome2("babad"));
    }

}
