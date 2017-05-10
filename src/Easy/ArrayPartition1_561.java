package Easy;

/**
 * Created by tonyliu on 4/25/17.
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

 Example 1:
 Input: [1,4,3,2]

 Output: 4
 Explanation: n is 2, and the maximum sum of pairs is 4.
 *
 */
public class ArrayPartition1_561 {


    public int arrayPairSum(int[] nums) {

        int changeNum = 0;
        // bubble sort:
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j< nums.length; j++) {
                if(nums[i] > nums[j]) {
                    changeNum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = changeNum;
                }
            }
        }

        return nums[0] + nums[nums.length / 2 ];
    }

    public static void main(String[] args) {
        ArrayPartition1_561 array = new ArrayPartition1_561();
        int[] nums = new int[]{1, 3, 2, 4};
        System.out.println(array.arrayPairSum(nums));

    }
}
