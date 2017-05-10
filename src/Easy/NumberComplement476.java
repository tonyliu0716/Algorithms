package Easy;

import java.math.BigInteger;

/**
 * Created by tonyliu on 4/27/17.
 *
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 You could assume no leading zero bit in the integer’s binary representation.
 Example 1:
 Input: 5
 Output: 2
 Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 Example 2:
 Input: 1
 Output: 0
 Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 *
 */
public class NumberComplement476 {
    public int findComplement(int num) {
        String nums =  Integer.toBinaryString(num);

        String str = "";
        for(int i = 0; i < nums.length(); i++) {
            if(nums.charAt(i) == '1') {
                str += '0';
            } else {
                str += '1';
            }
        }
        BigInteger bigInteger = new BigInteger(str, 2);
        return Integer.parseInt(bigInteger.toString());
    }

    // to binary:

    public static void main(String[] args) {
        NumberComplement476 com = new NumberComplement476();
        com.findComplement(5);

    }


}
