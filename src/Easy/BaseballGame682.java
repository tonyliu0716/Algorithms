package Easy;

import java.util.ArrayList;

/**
 * Created by tonyliu on 2018/1/18.
 *
 * You're now a baseball game point recorder.

 Given a list of strings, each string can be one of the 4 following types:

 Integer (one round's score): Directly represents the number of points you get in this round.
 "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 Each round's operation is permanent and could have an impact on the round before and the round after.

 You need to return the sum of the points you could get in all the rounds.

 Example 1:
 Input: ["5","2","C","D","+"]
 Output: 30
 Explanation:
 Round 1: You could get 5 points. The sum is: 5.
 Round 2: You could get 2 points. The sum is: 7.
 Operation 1: The round 2's data was invalid. The sum is: 5.
 Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
 Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
 Example 2:
 Input: ["5","-2","4","C","D","9","+","+"]
          5   -2   4   -4  -4  9   5  14
          T    T   F    F   T  T   T   T
 Output: 27
 Explanation:
 Round 1: You could get 5 points. The sum is: 5.
 Round 2: You could get -2 points. The sum is: 3.
 Round 3: You could get 4 points. The sum is: 7.
 Operation 1: The round 3's data is invalid. The sum is: 3.
 Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
 Round 5: You could get 9 points. The sum is: 8.
 Round 6: You could get -4 + 9 = 5 points. The sum is 13.
 Round 7: You could get 9 + 5 = 14 points. The sum is 27.
 Note:
 The size of the input list will be between 1 and 1000.
 Every integer represented in the list will be between -30000 and 30000.
 */
public class BaseballGame682 {

    public int calPoints(String[] ops) {

        int[] points = new int[ops.length];
        boolean[] booleans = new boolean[ops.length];
        int lastTwoValidRound = 0;
        int lastTwoSum = 0;
        int sum = 0;

        for(int i = 0; i < ops.length; i++) {

            if (ops[i].equals("C")) {
                if(booleans[i - 1]) {
                    points[i] = - points[i - 1];
                    booleans[i] = booleans[i - 1] = false;
                }else {
                    for(int j = booleans.length - 1; j >= 0; j--) {
                        if(booleans[j]) {
                            points[i] = - points[j];
                            booleans[i] = booleans[j] = false;
                            break;
                        }
                    }
                }

            } else if(ops[i].equals("D")) {
                for(int j = booleans.length - 1; j >= 0; j--) {
                    if(booleans[j]) {
                        points[i] = 2 * points[j];
                        booleans[i] = true;
                        break;
                    }
                }
            } else if(ops[i].equals("+")) {
                for(int j = booleans.length - 1; j >= 0; j--) {
                    if(booleans[j]) {
                        lastTwoValidRound++;
                        if(lastTwoValidRound > 2) {
                            break;
                        } else {
                            lastTwoSum += points[j];
                        }
                    }
                }
                points[i] = lastTwoSum;
                lastTwoSum = 0;
                lastTwoValidRound = 0;
                booleans[i] = true;
            } else {
                points[i] = Integer.parseInt(ops[i]);
                booleans[i] = true;
            }


        }

        for(int i = 0; i < points.length; i++) {
            sum += points[i];
            System.out.print(points[i] + ", " + booleans[i] + ", " + ops[i]);
            System.out.println();
        }
        return sum;
    }

    public static boolean isNumber(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"5","2","C","D","+"};
        BaseballGame682 baseball = new BaseballGame682();

        String[] strings1 = {"5","-2","4","C","D","9","+","+"};

        String[] strings2 = {"-60","D","-36","30","13","C","C","-33","53","79"};
        System.out.println( "sum is " + baseball.calPoints(strings2) );



    }

}
