package Easy;

/**
 * Created by tonyliu on 2020/2/6.
 */
public class SplitAStringInBalancedStrings1221 {

    public int balancedStringSplit(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            i = SplitAStringInBalancedStrings1221.finder(i, s);
            count++;
        }
        return count;
    }

    public static int finder(int index, String s) {
        int numR = 0;
        int numL = 0;
        int returnIndex = 0;
        for(int i = index; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                numR++;
            }
            if (s.charAt(i) == 'L') {
                numL++;
            }
            if (numR == numL) {
                returnIndex = i;
                break;
            }
        }
        return returnIndex;
    }

    public static void main(String[] args) {
        SplitAStringInBalancedStrings1221 arr = new SplitAStringInBalancedStrings1221();
        System.out.println(arr.balancedStringSplit("RLRRLLRLRL"));

    }

}
