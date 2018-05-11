package Easy;

import java.util.ArrayList;

/**
 * Created by tao on 5/11/18.
 *
 * Given a string S and a character C, return an array of integers representing the shortest distance from
 * the character C in the string.

 Example 1:

 Input: S = "loveleetcode", C = 'e'
 Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]


 Note:

 S string length is in [1, 10000].
 C is a single character, and guaranteed to be in string S.
 All letters in S and C are lowercase.
 */
public class ShortestDistancetoaCharacter_821 {
    public int[] shortestToChar(String S, char C) {

        // keep index of the character C
        ArrayList<Integer> lists = new ArrayList<>();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == C) {
                lists.add(i);
            }
        }

        int[] indexs = new int[S.length()];
        for(int i = 0; i < indexs.length; i++) {
            int min = Math.abs(i - lists.get(0));
            for(int j = 0; j < lists.size(); j++) {
                if(min > Math.abs(i - lists.get(j))) {
                    min = Math.abs(i - lists.get(j));
                }
            }
            indexs[i] = min;
        }

        return indexs;
    }

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        ShortestDistancetoaCharacter_821 distances = new ShortestDistancetoaCharacter_821();
        int[] indexs = distances.shortestToChar(S, C);
        for(int i : indexs) {
            System.out.print(i + ", ");
        }

    }
}
