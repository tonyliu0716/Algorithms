package Easy;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by tao on 5/14/18.
 *
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
 * It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

 Words in the list of banned words are given in lowercase, and free of punctuation.
 Words in the paragraph are not case sensitive.  The answer is in lowercase.

 Example:
 Input:
 paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 banned = ["hit"]
 Output: "ball"
 Explanation:
 "hit" occurs 3 times, but it is a banned word.
 "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 Note that words in the paragraph are not case sensitive,
 that punctuation is ignored (even if adjacent to words, such as "ball,"),
 and that "hit" isn't the answer even though it occurs more because it is banned.


 Note:

 1 <= paragraph.length <= 1000.
 1 <= banned.length <= 100.
 1 <= banned[i].length <= 10.
 The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols,
 and even if it is a proper noun.)
 paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 Different words in paragraph are always separated by a space.
 There are no hyphens or hyphenated words.
 Words only consist of letters, never apostrophes or other punctuation symbols.
 */
public class MostCommonWord_819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll(",", "");
        paragraph = paragraph.replaceAll("\\.", "");
        paragraph = paragraph.replaceAll("!", "");
        paragraph = paragraph.replaceAll("\\?", "");
        paragraph = paragraph.replaceAll(";", "");
        paragraph = paragraph.replaceAll("'", "");
        paragraph = paragraph.toLowerCase();
        System.out.println("paragraph: " + paragraph);

        String[] words = paragraph.split(" ");
        HashMap<String, Integer> maps = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if(maps.get(words[i]) != null) {
                maps.put(words[i], maps.get(words[i]) + 1);
            } else {
                maps.put(words[i], 1);
            }
        }

        for(String bannedStr: banned) {
            System.out.println("Banned string: " + bannedStr);
            if(maps.get(bannedStr)!= null) {
                maps.put(bannedStr, 0);
            }
        }

        Set<String> sets = maps.keySet();
        int max = 0;
        String str = "";
        for(String s : sets) {
            System.out.println("String: " + s + ", number: " + maps.get(s));
            if(max < maps.get(s)) {
                max = maps.get(s);
                str = s;
            }
        }

        return str;
    }

    public static void main(String[] args) {
//        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
//        para = para.replaceAll(",", "");
//        para = para.replaceAll("\\.", "");
//        System.out.println(para);

        MostCommonWord_819 word = new MostCommonWord_819();
        String[] strs = {"hit"};
        System.out.println( word.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", strs) );

    }

}
