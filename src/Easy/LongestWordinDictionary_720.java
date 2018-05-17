package Easy;

import java.util.*;

/**
 * Created by tao on 5/16/18.
 *
 * Given a list of strings words representing an English Dictionary,
 * find the longest word in words that can be built one character at a time by other words in words.
 * If there is more than one possible answer, return the longest word with the smallest lexicographical order.

 If there is no answer, return the empty string.
 Example 1:
 Input:
 words = ["w","wo","wor","worl", "world"]
 Output: "world"
 Explanation:
 The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
 Example 2:
 Input:
 words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 Output: "apple"
 Explanation:
 Both "apply" and "apple" can be built from other words in the dictionary.
 However, "apple" is lexicographically smaller than "apply".
 Note:

 All the strings in the input will only contain lowercase letters.
 The length of words will be in the range [1, 1000].
 The length of words[i] will be in the range [1, 30].

 */
public class LongestWordinDictionary_720 {

    public String longestWord(String[] words) {
        Arrays.sort(words);

        boolean flag = false;
        List<String> validString = new ArrayList<>();

        for(int i = words.length - 1; i >= 0; i--) {

            for(int j = 0; j < words[i].length(); j++ ) {
                for(String s: words) {
                    if(s.equals(words[i].substring(0, j + 1))) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag) {
                validString.add(words[i]);
            }
        }

        int max = validString.get(0).length();
        for(String s: validString) {
           System.out.print(s + " ");
        }

        return validString.get(validString.size() - 1);
    }

    public String longestWord2(String[] words) {

        Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        String[] words = {"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"};
//        Arrays.sort(words);
//        for(String word: words) {
//            System.out.print(word + " ");
//        }


        //["m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"]
        LongestWordinDictionary_720 dic = new LongestWordinDictionary_720();
        String[] strs = {"m","mo","moc","moch","mochad","l","la","lat","latt","latte","c","ca","cat"};

        System.out.println( dic.longestWord2(strs));

    }

}
