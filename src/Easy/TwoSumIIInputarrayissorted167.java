package Easy;

/**
 * Created by tao on 5/24/17.
 *
 *
 Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 *
 */
public class TwoSumIIInputarrayissorted167 {


    public int[] twoSum(int[] num, int target) {
        int[] indice = new int[2];
        if (num == null || num.length < 2) return indice;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        TwoSumIIInputarrayissorted167 array = new TwoSumIIInputarrayissorted167();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] sums = array.twoSum(nums, 9);
        for(int x : sums) {
            System.out.println(x);
        }
    }

}
