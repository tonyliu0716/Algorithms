package Medium;

import java.util.*;


/**
 * Created by tonyliu on 2017/12/5.
 *
 *
 *Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class LongestSubstringWithoutRepeatingCharacters3 {

    public static int lengthOfLongestSubstring(String s) {

        ArrayList<Character> ar = new ArrayList<>();
        int max = 0;

        for(int i = 0;i < s.length();i++){
            while(ar.contains(s.charAt(i))){
                ar.remove(0);
            }
            ar.add(s.charAt(i));

            max = Math.max(max, ar.size());
        }
        return max;
    }



    public static List<String> combination(Object[] arr) {

        List<String> list = new ArrayList<>();

        int all = arr.length;
        int nbit = 1 << all;
        for (int i = 0; i < nbit; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < all; j++) {
                if ((i & (1 << j)) != 0) {
                    sb.append(arr[j]);
                }
            }
            list.add(sb.toString());
            //System.out.println(sb);
        }
        return list;
    }




    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("pwwkew"));

    }
}
