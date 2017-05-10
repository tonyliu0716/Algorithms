package Easy;

/**
 * Created by tonyliu on 4/25/17.
 *
 * Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 *
 */
public class ReverseWordsinaStringIII {

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String reverse = "";
        for(int i = 0; i < strs.length; i++) {
            String str = strs[i];

            String str1 = "";
            for(int j = str.length() - 1; j >= 0; j--) {
                str1 += str.charAt(j);
            }
            if(i == strs.length - 1) {
                reverse += str1;
            } else {
                reverse += str1 + " ";
            }

        }

        System.out.println(reverse);

        return null;
    }

    public static void main(String[] args) {
        ReverseWordsinaStringIII words = new ReverseWordsinaStringIII();
        words.reverseWords("Let's take LeetCode contest");
    }

}
