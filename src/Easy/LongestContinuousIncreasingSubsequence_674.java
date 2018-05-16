package Easy;

/**
 * Created by tao on 5/16/18.
 *
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

 Example 1:
 Input: [1,3,5,4,7]
 Output: 3
 Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
 Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
 Example 2:
 Input: [2,2,2,2,2]
 Output: 1
 Explanation: The longest continuous increasing subsequence is [2], its length is 1.
 Note: Length of the array will not exceed 10,000.
 */
public class LongestContinuousIncreasingSubsequence_674 {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        int distance = 1;
        int max = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                distance += 1;
                if(max < distance) {
                    max = distance;
                }
            } else {
                if(max < distance) {
                    max = distance;
                }
                distance = 1;
            }
            System.out.println("distance: " + distance);
            System.out.println("max: " + max);
        }
        return max;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence_674 longest = new LongestContinuousIncreasingSubsequence_674();
        System.out.println( longest.findLengthOfLCIS(new int[]{1,3,5,7}) );
    }

}
