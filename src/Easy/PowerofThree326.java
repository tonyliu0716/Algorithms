package Easy;

/**
 * Created by tao on 5/17/18.
 *
 * Given an integer, write a function to determine if it is a power of three.

 Follow up:
 Could you do it without using any loop / recursion?

 Credits:
 Special thanks to @dietpepsi for adding this problem and creating all test cases.
 */
public class PowerofThree326 {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 0) {
            if (n == 1) {
                return true;
            } else if (n % 3 != 0) {
                return false;
            } else {
                n /= 3;
            }
        }
        return true;
    }

}
