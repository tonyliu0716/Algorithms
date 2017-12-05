package Easy;

/**
 * Created by tao on 7/3/17.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 */
public class MissingNumber268 {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;

        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 3};
        MissingNumber268 number268 = new MissingNumber268();
        System.out.println("The missing number is: " + number268.missingNumber(nums));
    }

}
