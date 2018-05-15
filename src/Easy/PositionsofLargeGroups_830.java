package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 5/14/18.
 *
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.

 For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

 Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

 The final answer should be in lexicographic order.



 Example 1:

 Input: "abbxxxxzzy"
 Output: [[3,6]]
 Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 Example 2:

 Input: "abc"
 Output: []
 Explanation: We have "a","b" and "c" but no large group.
 Example 3:

 Input: "abcdddeeeeaabbbcd"
 Output: [[3,5],[6,9],[12,14]]
 *
 */
public class PositionsofLargeGroups_830 {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> lists = new ArrayList<>();

        int start = 0;
        int end = 0;

        for(int i = 0; i < S.length(); i++) {
            start = i;
            for(int j = i + 1; j < S.length(); j++) {
                if(S.charAt(i) == S.charAt(j) && j != S.length() - 1) {
                    end = j;
                } else if(S.charAt(i) == S.charAt(j) && j == S.length() - 1) {
                    end = j;
                    if(end - start >= 2) {
                        List<Integer> location = new ArrayList<>();
                        location.add(start);
                        location.add(end);
                        lists.add(location);
                        i = end;

                    }
                    break;
                } else {
                    if(end - start >= 2) {
                        List<Integer> location = new ArrayList<>();
                        location.add(start);
                        location.add(end);
                        lists.add(location);
                        i = end;
                    }
                    break;

                }
            }


        }


        return lists;
    }

    public static void main(String[] args) {
        PositionsofLargeGroups_830 group = new PositionsofLargeGroups_830();
        List<List<Integer>> lists = group.largeGroupPositions("aaaa");
        for(int i = 0; i < lists.size(); i++) {
            for(Integer integer : lists.get(i)) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

}
