package Easy;

import java.util.ArrayList;
import java.util.HashSet;

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
    public int[] intersection(int[] nums1, int[] nums2) {
        // we can use two hash set to store the elements
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();

        for(int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(set1.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;
        for(Integer num : intersect) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args){
        IntersectionOfTwoArrays349 array = new IntersectionOfTwoArrays349();
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        int[] result = array.intersection(nums1, nums2);
        for(int num: result) {
            System.out.println(num);
        }
    }

}
