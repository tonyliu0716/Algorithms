package Easy;

/**
 * Created by tonyliu on 5/9/17.
 *
 * Input: [1,1,0,1,1,1]
 Output: 3
 Explanation: The first two digits or the last three digits are consecutive 1s.
 The maximum number of consecutive 1s is 3.
 *
 */
public class MaxConsecutiveOnes485 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int con = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                con += 1;
                if(con > max) {
                    max = con;
                }

            } else {
                con = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes485 one = new MaxConsecutiveOnes485();
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println( one.findMaxConsecutiveOnes(nums) );
    }

}
