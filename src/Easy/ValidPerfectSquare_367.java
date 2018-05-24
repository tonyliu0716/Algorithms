package Easy;

/**
 * Created by tao on 5/23/18.
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False
 */
public class ValidPerfectSquare_367 {

    // 1 + 3 + .. + (2n - 1) = Math.pow(n, 2);
    public boolean isPerfectSquare(int num) {
        int sqrt = num;
        // find the odd numbers
        for(int i = 1; ; i+= 2) {
            if(num - i > 0) {
                num = num -i;
                //System.out.println(num);
            }
            if(num == i && ((i + 1) / 2) * ((i + 1) / 2) == sqrt) {
                return true;
            }
            if(num - i < 0) {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        ValidPerfectSquare_367 valid = new ValidPerfectSquare_367();
        System.out.println(valid.isPerfectSquare(254));
    }
}
