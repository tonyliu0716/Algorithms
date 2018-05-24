package Easy;

/**
 * Created by tao on 5/23/18.
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

 Example:
 Given num = 16, return true. Given num = 5, return false.

 Follow up: Could you solve it without loops/recursion?
 */
public class PowerofFour_342 {

    public boolean isPowerOfFour(int num) {
        if(num == 0) {
            return false;
        }
        if(num == 1) {
            return true;
        }
        while(num != 1) {
            if(num % 4 == 0) {
                num = num / 4;
            } else {
                return false;
            }
            if(num == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
