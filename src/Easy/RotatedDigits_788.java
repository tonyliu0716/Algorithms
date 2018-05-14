package Easy;

/**
 * Created by tao on 5/14/18.
 *
 * X is a good number if after rotating each digit individually by 180 degrees,
 * we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.

 A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves;
 2 and 5 rotate to each other; 6 and 9 rotate to each other,
 and the rest of the numbers do not rotate to any other number and become invalid.

 Now given a positive number N, how many numbers X from 1 to N are good?

 Example:
 Input: 10
 Output: 4
 Explanation:
 There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 Note:

 N  will be in range [1, 10000].
 */
public class RotatedDigits_788 {

    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(rotate(i) == true) {
                count++;
            }
        }

        return count;
    }

    private boolean rotate(int number) {

        StringBuffer sb = new StringBuffer(number + "");
        StringBuffer newSb = new StringBuffer();
        //System.out.println("length: " + sb.length());
        for(int i = 0; i < sb.length(); i++) {
            char digit = sb.charAt(i);
            if(digit == '3' || digit == '4' || digit == '7') {
                return false;
            }
            switch(digit) {
                case '0':
                    newSb.append('0');
                    break;
                case '1':
                    newSb.append('1');
                    break;
                case '2':
                    newSb.append('5');
                    break;
                case '5':
                    newSb.append('2');
                    break;
                case '6':
                    newSb.append('9');
                    break;
                case '8':
                    newSb.append('8');
                    break;
                case '9':
                    newSb.append('6');
                    break;
            }

        }


        if(newSb.toString().equals(sb.toString())) {
            return false;
        }
        if(newSb.charAt(0) == '0') {
            return false;
        }
        System.out.println("newSb: " + newSb);
        return true;
    }


    public static void main(String[] args) {
        RotatedDigits_788 digit = new RotatedDigits_788();
        System.out.println( digit.rotatedDigits(10) );
    }

}
