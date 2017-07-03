package Easy;

import java.util.Arrays;

/**
 * Created by tao on 7/3/17.
 */
public class MaximumProductofThreeNumbers628 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        //One of the Three Numbers is the maximum value in the array.

        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        MaximumProductofThreeNumbers628 numbers = new MaximumProductofThreeNumbers628();


        int[] nums1 = new int[]{1, 2, 3};
        System.out.println(numbers.maximumProduct(nums1));

        int[] nums2 = new int[]{1, 2, 3, 4};
        System.out.println(numbers.maximumProduct(nums2));

    }

}
