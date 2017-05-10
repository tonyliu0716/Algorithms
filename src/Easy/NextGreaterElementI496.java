package Easy;

import java.util.HashMap;

/**
 * Created by tonyliu on 5/9/17.
 *
 * Example 1:
 Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 Output: [-1,3,-1]
 Explanation:
 For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 For number 1 in the first array, the next greater number for it in the second array is 3.
 For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 *
 */
public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            maps.put(nums[i], i);
        }

        int[] newNum = new int[findNums.length];
        for(int i = 0; i < newNum.length; i++) {
            newNum[i] = findGreater(findNums[i], maps, nums);
        }
        return newNum;
    }

    public static int findGreater(int num, HashMap<Integer, Integer> maps, int[] nums) {
        int position = maps.get(num);
        if(position == maps.size() - 1) {
            return -1;
        } else {
            for(int i = position + 1; i < nums.length; i++) {
                if(nums[i] > nums[position]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        NextGreaterElementI496 next = new NextGreaterElementI496();
        int[] findNums = new int[]{4, 1, 2};
        int[] nums = new int[]{1, 3, 4, 2};

        int[] newArr = next.nextGreaterElement(findNums, nums);
        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

}
