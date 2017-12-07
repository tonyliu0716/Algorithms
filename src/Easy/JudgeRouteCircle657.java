package Easy;

/**
 * Created by tonyliu on 2017/12/6.
 *
 *
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true
 Example 2:
 Input: "LL"
 Output: false
 *
 */
public class JudgeRouteCircle657 {

    public boolean judgeCircle(String moves) {

        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;

        for(int i = 0; i < moves.length(); i++) {
            makeMove(moves.charAt(i), arr);
        }

        if(arr[0] == 0 && arr[1] == 0) {
            return true;
        }

        return false;
    }

    public static void makeMove(Character c, int[] arr) {

        if(c == 'U') {
            arr[1] += 1;
        }

        if(c == 'D') {
            arr[1] -= 1;
        }

        if(c == 'L') {
            arr[0] -= 1;
        }

        if(c == 'R') {
            arr[0] += 1;
        }

    }

}
