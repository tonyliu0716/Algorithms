package Easy;

import java.util.*;

/**
 * Created by tao on 6/19/17.
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 *
 */
public class IntersectionOfTwoArrays349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int num : nums1) {
            if(map1.get(num) != null) {
                map1.put(num, map1.get(num) + 1);
            } else {
                map1.put(num, 1);
            }
        }

        for(int num : nums2) {
            if(map2.get(num) != null) {
                map2.put(num, map2.get(num) + 1);
            } else {
                map2.put(num, 1);
            }
        }

        List<Integer> lists = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int num = entry.getKey();
            if(map2.get(num) != null && map1.get(num) == map2.get(num)) {
                for(int i = 0; i < entry.getValue(); i++) {
                    lists.add(num);
                }

            }
        }



        int[] nums = new int[lists.size()];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = lists.get(i);
        }
        return nums;
    }

    public static void main(String[] args){
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        int[] arr = IntersectionOfTwoArrays349.intersection(num1, num2);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

}
