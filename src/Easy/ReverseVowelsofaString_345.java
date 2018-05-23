package Easy;

import java.util.ArrayList;

/**
 * Created by tao on 5/23/18.
 *
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".


 */
public class ReverseVowelsofaString_345 {

    public String reverseVowels(String s) {
        if(s.length() == 0 && s.length() == 1) {
            return s;
        }
        String vowels = "aeiouAEIOU";
        StringBuffer string = new StringBuffer();
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i) + "")) {
                string.append(s.charAt(i));
                index.add(i);
            }
        }
        // there are no vowels found in the string
        if(index.size() == 0) {
            return s;
        }
        System.out.println("index size " + index.size() + ", string: " + string);
        string = string.reverse();
        int vowelIndex = 0;
        StringBuffer newString = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            if(i != index.get(vowelIndex)) {
                newString.append(s.charAt(i));
            } else {
                newString.append(string.charAt(vowelIndex));
                vowelIndex++;
                if(vowelIndex >= index.size()) {
                    vowelIndex --;
                }
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        ReverseVowelsofaString_345 reverse = new ReverseVowelsofaString_345();
        System.out.println(reverse.reverseVowels("aA"));
    }

}
