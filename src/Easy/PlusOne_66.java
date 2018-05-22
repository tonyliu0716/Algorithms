package Easy;

import java.util.Stack;

/**
 * Created by tao on 5/22/18.
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

 The digits are stored such that the most significant digit is at the head of the list,
 and each element in the array contain a single digit.

 You may assume the integer does not contain any leading zero, except the number 0 itself.

 Example 1:

 Input: [1,2,3]
 Output: [1,2,4]
 Explanation: The array represents the integer 123.
 Example 2:

 Input: [4,3,2,1]
 Output: [4,3,2,2]
 Explanation: The array represents the integer 4321.
 */
public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        StringBuffer sb = new StringBuffer();

        for(int digit: digits) {
            sb.append(digit);
        }
        int length = sb.length();
        int carry = 0;
        int sum = 0;
        Stack<Integer> numbers = new Stack<>();

        for(int i = length - 1; i >= 0; i--) {
            if(i == length - 1) {
                sum = Integer.parseInt(sb.charAt(i) + "") + 1 + carry;
            } else {
                sum = Integer.parseInt(sb.charAt(i) + "") + carry;
            }

            if(sum >= 10) {
                carry = 1;
                numbers.add(sum - 10);
            } else {
                carry = 0;
                numbers.add(sum);
            }

        }
        System.out.println("Now carry is " + carry);
        if(carry != 0) {
            numbers.add(carry);
        }

        int[] newDigits = new int[numbers.size()];
        for(int i = 0; i < newDigits.length; i++) {
            newDigits[i] = numbers.pop();
        }
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne_66 one = new PlusOne_66();
        int[] nums = one.plusOne(new int[]{9, 9, 9, 9});
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
