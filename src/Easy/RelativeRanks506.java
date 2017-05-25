package Easy;

/**
 * Created by tonyliu on 5/24/17.
 *
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

 Example 1:
 Input: [5, 4, 3, 2, 1]
 Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 For the left two athletes, you just need to output their relative ranks according to their scores.
 *
 *
 */
public class RelativeRanks506 {

    public String[] findRelativeRanks(int[] nums) {
        String[] strings = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        if(nums.length <= 3) {
            String[] strs = new String[nums.length];
            for(int i = 0; i < strs.length; i++) {
                strs[i] = strings[i];
            }
            return strs;
        }

        // [10, 3, 8, 9, 4]
        // ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
        int[] newNums = nums;
        for(int i = 0; i < newNums.length; i++) {
            for(int j = i; j < newNums.length; j++) {
                if(newNums[i] > newNums[j]) {
                    int temp = newNums[i];
                    newNums[i] = newNums[j];
                    newNums[j] = temp;
                }
            }
        }
        String[] strs = new String[nums.length];



        return strs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 2, 5, 6, 3};
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                max = nums[i + 1];
                maxIndex = i + 1;
            }
        }
        System.out.println(maxIndex);

    }
}
