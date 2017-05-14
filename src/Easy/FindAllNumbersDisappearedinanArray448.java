package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tonyliu on 5/11/17.
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]
 *
 */
public class FindAllNumbersDisappearedinanArray448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedinanArray448 arr = new FindAllNumbersDisappearedinanArray448();

        int[] nums = new int[]{10,2,5,10,9,1,1,4,3,7};
        List<Integer> lists = arr.findDisappearedNumbers(nums);
        for(int element : lists) {
            System.out.println(element);
        }
    }

}
