package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyliu on 2017/12/6.
 *
 * A self-dividing number is a number that is divisible by every digit it contains.

 For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

 Also, a self-dividing number is not allowed to contain the digit zero.

 Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

 Example 1:
 Input:
 left = 1, right = 22
 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 Note:

 The boundaries of each input argument are 1 <= left <= right <= 10000.
 *
 *
 */
public class SelfDividingNumbers728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lists = new ArrayList<>();

        for(int i = left; i <= right; i++) {
            if(selfDividing(i)) {
                lists.add(i);
            }
        }

        return lists;
    }

    public static boolean selfDividing(int num) {
        StringBuffer sb = new StringBuffer(num + "");
        int count = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(Integer.parseInt(sb.charAt(i) + "") == 0) {
                return false;
            }
            if(num % Integer.parseInt(sb.charAt(i) + "") == 0) {
                count++;
            }
        }
        if(count == sb.length()) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        List<Integer> lists = SelfDividingNumbers728.selfDividingNumbers(1, 22);

        for(Integer i : lists) {
            System.out.print(i + " ");
        }

       // System.out.println(new StringBuffer("18763").length());
    }

}
