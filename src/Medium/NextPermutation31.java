package Medium;
/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:

Input: nums = [1]
Output: [1]
*/


public class NextPermutation31 {
    // nums = {1，5，8，4，7，6，5，3，1}
    // 从后往前找 第一个不是升序的元素 --> 4
    // 替换： 从该元素从前往后 找第一个比它大的元素进行替换 --> 5
    // 替换后： 1，5，8，5，7，6，4，3，1
    // 然后从替换的位置到最后，倒置： 1，5，8，5，1，3，4，6，7
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1};
        new NextPermutation31().nextPermutation(nums);
        for(int num: nums) {
            System.out.print(num + " ");
        }
    }
    
}
