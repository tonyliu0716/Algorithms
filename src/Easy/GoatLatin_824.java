package Easy;

/**
 * Created by tao on 5/11/18.
 *
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

 We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

 The rules of Goat Latin are as follows:

 If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 For example, the word 'apple' becomes 'applema'.

 If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 For example, the word "goat" becomes "oatgma".

 Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 Return the final sentence representing the conversion from S to Goat Latin.



 Example 1:

 Input: "I speak Goat Latin"
 Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 Example 2:

 Input: "The quick brown fox jumped over the lazy dog"
 Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


 Notes:

 S contains only uppercase, lowercase and spaces. Exactly one space between each word.
 1 <= S.length <= 150.
 */
public class GoatLatin_824 {

    public String toGoatLatin(String S) {

        //separate the sentence to words
        String[] strings = S.split(" ");

        StringBuffer newString = new StringBuffer();

        for(int i = 0; i < strings.length; i++) {
            StringBuffer sb = new StringBuffer(strings[i]);
            char first = strings[i].charAt(0);
            //if the word begins with a vowel - a e i o u, append "ma" to the end of the word.
            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E'
                    || first == 'I' || first == 'O' || first == 'U') {
                sb.append("ma");
            } else {
                //If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
                char firstOne = sb.charAt(0);
                sb = sb.deleteCharAt(0);
                sb.append(firstOne);
                sb.append("ma");
            }

            //Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
            for(int j = 0; j < i + 1; j++) {
                sb.append('a');
            }
            if(i != strings.length - 1) {
                newString.append(sb + " ");
            } else {
                newString.append(sb);
            }


        }

        return newString.toString();
    }

    public static void main(String[] args) {
        String a = "The quick brown fox jumped over the lazy dog";
        GoatLatin_824 latin = new GoatLatin_824();
        System.out.println( latin.toGoatLatin(a));
//          StringBuffer sb = new StringBuffer("speak");
//          StringBuffer jb = sb.deleteCharAt(0);
//          sb.append(jb);
//          System.out.println(sb);
    }

}
