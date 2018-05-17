package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tao on 5/17/18.
 *
 * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.

 Now, given an integer array,
 you need to find the length of its longest harmonious subsequence among all its possible subsequences.

 Example 1:
 Input: [1,3,2,2,5,2,3,7]
 Output: 5
 Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 Note: The length of the input array will not exceed 20,000.
 */
public class LongestHarmoniousSubsequence_594 {


    // time limit exceeded
    public int findLHS(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        int maxLength = 0;
        int preLength = 0;
        for(int i = 0; i < nums.length; i++) {
            maxLength = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] || nums[i] - nums[j] == 1) {
                    maxLength += 1;
                    sets.add(nums[j]);
                }
            }
            if(preLength < maxLength && sets.size() != 1) {
                preLength = maxLength;
            }
            sets.clear();
        }
        return preLength;
    }

    // time limit exceeded
    public int findLHS2(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int currentLength = 0;
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++) {
            //System.out.println("set first add: " + nums[i]);
            set.add(nums[i]);
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == nums[i] + 1 || nums[j] == nums[i]) {
                    currentLength = j - i + 1;
                    set.add(nums[j]);
                    //System.out.println("set second add: " + nums[j]);
                }
            }
            if(maxLength < currentLength && set.size() != 1) {
                maxLength = currentLength;
            }
            //System.out.println("set clear...");
            set.clear();
        }
        return maxLength;
    }

    //
    public int findLHS3(int[] nums) {
        Arrays.sort(nums);
        // use Hashmap
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int num: nums) {
            if(maps.get(num) != null) {
                maps.put(num, maps.get(num) + 1);
            } else {
                maps.put(num, 1);
            }
        }
        int max = 0;
        Set<Integer> integers = maps.keySet();
        for(Integer num : integers) {
            if(integers.contains(num + 1)) {
                max = Math.max(max, maps.get(num) + maps.get(num + 1));
            }
        }
        return max;
    }



    public static void main(String[] args) {
        LongestHarmoniousSubsequence_594 longest = new LongestHarmoniousSubsequence_594();
        int[] nums = new int[]{1,3,2,2,5,2,3,7};
        System.out.println( longest.findLHS3(nums) );



    }
}
