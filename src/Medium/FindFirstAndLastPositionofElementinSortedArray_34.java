package Medium;

/*
*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
* */

public class FindFirstAndLastPositionofElementinSortedArray_34 {

    public int[] searchRange(int[] nums, int target) {

        int[] res = {-1,-1};
        if(nums.length==0) return res;
        res[0] = findFirstIndex(nums, target);
        // if res[0] == nums.length, the target number is larger than all numbers in the array
        // if nums[res[0]] > target then we don't find an exact match of target in the array
        if(res[0] == nums.length || nums[res[0]] > target) return new int[]{-1,-1};

        int hi = findFirstIndex(nums, target + 1);
        // if hi == nums.length, then the target number is all the way to the end of the array
        res[1] = hi == nums.length ? nums.length - 1 : hi - 1;
        return res;
    }

    public int findFirstIndex(int[] nums, int target) {// first that >= target
        int left = 0, right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] >= target) {
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;
    }



    public static void main(String[] args) {
        FindFirstAndLastPositionofElementinSortedArray_34 arr = new FindFirstAndLastPositionofElementinSortedArray_34();
        int[] ints = new int[]{1,2,3};
        int[] indexs = arr.searchRange(ints, 2);
        for(int index: indexs) {
            System.out.print(index + " ");
        }
    }

}
