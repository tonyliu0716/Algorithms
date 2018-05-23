package Easy;

import java.util.Arrays;

/**
 * Created by tao on 5/23/18.
 *
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error,
 * one of the numbers in the set got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.

 Given an array nums representing the data status of this set after the error.
 Your task is to firstly find the number occurs twice and then find the number that is missing.
 Return them in the form of an array.

 Example 1:
 Input: nums = [1,2,2,4]
 Output: [2,3]
 Note:
 The given array size will in the range [2, 10000].
 The given array's numbers won't have any order.
 */
public class SetMismatch_645 {


    // always getting wrong answer, don't know why
    public int[] findErrorNums(int[] nums) {
        int[] newArray = new int[2];
        Arrays.sort(nums);

        // 1, 2, 2, 3, 4, 5, 6, 7, 8, 9
        // 1, 2, 2, 4, 5, 6, 7, 8, 9, 10

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // how to find the duplicated one

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                newArray[0] = nums[i];
            }
            sb.append(nums[i] + ",");
            // 1,2,2,3,4,5,6,7,8,9
            // 1,2,2,4,5,6,7,8,9,10
        }
        sb.append(nums[nums.length - 1] + ",");

        String string = sb.toString();
        // how to find the missing one
        for(int i = 0; i < nums.length; i++) {
            int num = i + 1;
            if(!string.contains(num + ",")) {
                newArray[1] = num;
                break;
            }

        }

        for(int i : newArray) {
            System.out.print(i + " ");
        }

        return newArray;
    }

    //see their solution:
    public int[] findErrorNums2(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }

    public static void main(String[] args) {
        SetMismatch_645 mis = new SetMismatch_645();
        int[] nums = new int[]{1,2,3,4,5,4,7,8,9};

        mis.findErrorNums(nums);
    }

}
