package Easy;

/**
 * Created by tao on 5/17/18.
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.

 Example:

 Input: [-2,1,-3,4,-1,2,1,-5,4],
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 Follow up:

 If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 which is more subtle.
 */
public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            for(int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }

            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray_53 sub = new MaximumSubarray_53();
        int[] arr = new int[]{2,-1, -2};
        System.out.println(sub.maxSubArray(arr));
    }
}
