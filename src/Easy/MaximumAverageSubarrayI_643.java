package Easy;

/**
 * Created by tao on 5/24/18.
 *
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.

 Example 1:
 Input: [1,12,-5,-6,50,3], k = 4
 Output: 12.75
 Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 Note:
 1 <= k <= n <= 30,000.
 Elements of the given array will be in the range [-10,000, 10,000].
 */
public class MaximumAverageSubarrayI_643 {

    public double findMaxAverage(int[] nums, int k) {

        if(k >= nums.length) {
            double sum = 0;
            for(int num: nums) {
                sum += num;
            }
            return sum / nums.length;
        }
        double sum = 1.0 * Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(i + k > nums.length) {
                break;
            }
            double total = 0;
            for(int j = i; j < i+k; j++) {
                total += nums[j];
                //System.out.println("total: " + total);
            }
            sum = Math.max(sum, total);
        }
        //System.out.println(sum);
        return sum / k;
    }

    // bring up another idea
    // [4, 0, 4, 3, 3]
    // sum array: 4, 4, 8, 11, 14
    // solution: https://leetcode.com/problems/maximum-average-subarray-i/solution/

    public double findMaxAverage2(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
            System.out.print(sum[i] + " ");
        }
        double res = sum[k - 1] * 1.0 / k;
        for (int i = k; i < nums.length; i++) {
            res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k);
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI_643 max = new MaximumAverageSubarrayI_643();
        System.out.println(max.findMaxAverage2(new int[]{4,0,4,3,3}, 5));

    }

}
