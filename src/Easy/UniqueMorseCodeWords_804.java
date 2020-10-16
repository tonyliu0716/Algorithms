package Easy;

import java.util.HashMap;

/**
 * Created by tao on 4/10/18.
 *
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-",
 * "b" maps to "-...", "c" maps to "-.-.", and so on.

 For convenience, the full table for the 26 letters of the English alphabet is given below:

 [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
 ".--","-..-","-.--","--.."]
 Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written
 as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

 Return the number of different transformations among all words we have.

 Example:
 Input: words = ["gin", "zen", "gig", "msg"]
 Output: 2
 Explanation:
 The transformation of each word is:
 "gin" -> "--...-."
 "zen" -> "--...-."
 "gig" -> "--...--."
 "msg" -> "--...--."

 There are 2 different transformations, "--...-." and "--...--.".


 Note:

 The length of words will be at most 100.
 Each words[i] will have length in range [1, 12].
 words[i] will only consist of lowercase letters.
 */
public class UniqueMorseCodeWords_804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-", ".--","-..-","-.--","--.."};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        HashMap<String, String> letterMaps = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            letterMaps.put(letters[i], alphabet[i]);
        }

        HashMap<String, Integer> maps = new HashMap<>();

        for(int i  = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer();
            for(int j  = 0; j < words[i].length(); j++) {
                sb.append(letterMaps.get(words[i].charAt(j) + ""));
            }
            if(maps.get(sb.toString()) != null) {
                maps.put(sb + "", maps.get(sb.toString()) + 1);
            } else {
                maps.put(sb + "", 1);
            }
        }

        return maps.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new UniqueMorseCodeWords_804().uniqueMorseRepresentations(words));
    }
}
