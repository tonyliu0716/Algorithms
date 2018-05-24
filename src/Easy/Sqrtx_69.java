package Easy;

/**
 * Created by tao on 5/23/18.
 *
 * Implement int sqrt(int x).

 Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

 Since the return type is an integer,
 the decimal digits are truncated and only the integer part of the result is returned.

 Example 1:

 Input: 4
 Output: 2
 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since
 the decimal part is truncated, 2 is returned.
 */
public class Sqrtx_69 {

    // 1 + 3 + .. + (2n - 1) = Math.pow(n, 2)
    // but time limit exceeded
    public int mySqrt(int x) {
        if(x == 1) {
            return 1;
        }
        int curSum = 0;
        for(int i = 1; ; i += 2) {
            curSum += i;
            if(curSum > x) {
                return (i - 1) / 2;
            } else if(curSum == x) {
                return (i + 1) / 2;
            }

        }
    }

    public int mySqrt2(int x) {
        int i = 0;
        while(x > 0){
            x -= 2 * (i++) + 1;
        }
        if(x == 0) return i;
        return i - 1;
    }


    public static void main(String[] args) {
        Sqrtx_69 sqrtx = new Sqrtx_69();
        System.out.println(sqrtx.mySqrt2(2147483647));
    }
}
