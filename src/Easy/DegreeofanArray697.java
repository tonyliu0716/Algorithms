package Easy;

import java.util.*;

/**
 * Created by tonyliu on 2017/12/4.
 *
 *
 Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum
 frequency of any one of its elements.

 Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

 Example 1:
 Input: [1, 2, 2, 3, 1]
 Output: 2
 Explanation:
 The input array has a degree of 2 because both elements 1 and 2 appear twice.
 Of the subarrays that have the same degree:
 [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 The shortest length is 2. So return 2.
 Example 2:
 Input: [1,2,2,3,1,4,2]
 Output: 6
 *
 */
public class DegreeofanArray697 {

    public int findShortestSubArray(int[] nums) {




        return 0;
    }

    public static int findSubArray(int[] nums) {

        if(nums.length == 1) {
            return nums.length;
        }

        HashMap<Integer, Integer> maps = new HashMap<>();

        HashMap<Integer, Integer> maxApperMaps = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(maps.get(nums[i]) == null) {
                maps.put(nums[i], 1);
                maxApperMaps.put(nums[i], 1);
            } else {
                for(int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        maps.put(nums[i], i - j + 1);
                        break;
                    }
                }
                maxApperMaps.put(nums[i], maxApperMaps.get(nums[i]) + 1);
            }
        }


        int maxApperTime = 0;
        ArrayList<Integer> lists = new ArrayList<>();
        int maxApperNum = 0;
        for(Map.Entry<Integer, Integer> entry : maxApperMaps.entrySet()) {
            if(maxApperTime < entry.getValue()) {
                maxApperTime = entry.getValue();
            }
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry : maxApperMaps.entrySet()) {
            if(entry.getValue() ==  maxApperTime) {
                lists.add(entry.getKey());
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < lists.size(); i++) {
            System.out.println("Element of Lists: " + lists.get(i));
            if(min > maps.get(lists.get(i))) {
                min = maps.get(lists.get(i));
            }
        }

        return min;

    }




    public static void main(String[] args) {
        //int[] nums = {1,1,2,2,2,1};
        //int[] nums = {1, 2, 2, 3, 1};
        int[] nums = {1,2,2,3,1,4,2};
//        int[] nums = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,
//                15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,
//                47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        System.out.println( DegreeofanArray697.findSubArray(nums));


    }

}
