package Easy;

import java.util.HashMap;

/**
 * Created by tonyliu on 6/20/17.
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.
 *
 */
public class ValidAnagram242 {

    // this solution has time limit exceeded.
    public boolean isAnagramTime(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        boolean[] booleans = new boolean[s.length()];

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            for(int j = 0; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j) && !booleans[j]) {
                    count ++;
                    booleans[j] = true;
                    break;
                }
            }
            if(count != i + 1) {
                System.out.println("Now we found a quicker way to do so");
                return false;
            }

        }
        System.out.println("count: " + count);
        if(count == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    // much better -> HashMap solution!!
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return  false;
        HashMap<Character, Integer> maps = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(maps.get(s.charAt(i)) == null) {
                maps.put(s.charAt(i), 1);
            } else {
                maps.put(s.charAt(i), maps.get(s.charAt(i)) + 1);
            }
        }

        // start to work on String t
        for(int i = 0; i < t.length(); i++) {
            if(maps.get(t.charAt(i)) == null) {
                return false;
            } else {
                if(maps.get(t.charAt(i)) != 0) {
                    maps.put(t.charAt(i), maps.get(t.charAt(i)) - 1);
                } else {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram242 anagram242 = new ValidAnagram242();
        String s1 = "anagram";
        String s2 = "nagaram";

        String s3 = "rat";
        String s4 = "car";
        System.out.println(anagram242.isAnagramTime(s3, s4));
    }

}
