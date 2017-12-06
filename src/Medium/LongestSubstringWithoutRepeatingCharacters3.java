package Medium;

import java.util.*;

import static com.sun.tools.doclint.Entity.lambda;

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

        if(s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        if(s.length() == 2 ) {
            if(s.charAt(0) == s.charAt(1)) {
                return s.length() - 1;
            } else {
                return s.length();
            }
        }

        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        Object[] arr = set.toArray();


        List<String> list = combination(arr);


        // testing
        for(String sb : list) {
            System.out.println(sb);
        }

        System.out.println("------------");
        int max = 0;
        for(int i = 0; i < list.size(); i++) {
            if(s.contains(list.get(i))) {

                if(max < list.get(i).length()) {
                    max = list.get(i).length();
                    System.out.println(list.get(i) + " : " + max);
                }
            }
        }

        return max;
    }



    public static List<String> combination(Object[] arr) {

        List<String> list = new ArrayList<>();

        int all = arr.length;
        int nbit = 1 << all;
        for (int i = 0; i < nbit; i++) {
            StringBuffer sb = new StringBuffer();
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
