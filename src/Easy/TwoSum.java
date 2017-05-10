package Easy;

/**
 * Created by tonyliu on 4/24/17.
 *
 * Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 *
 */
public class TwoSum {

    private int[] sums = new int[2];
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2 && nums[0] + nums[1] == target) {
            sums[0] = 0;
            sums[1] = 1;
            return sums;
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(nums[i] == nums[j] && i == j) {
                    continue;
                }
                if(nums[i] + nums[j] == target) {
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }
        return sums;
    }

    public static void main(String[] args) {

        TwoSum two = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};

        int[] towSums = two.twoSum(nums, 9);
        for(int i = 0; i < towSums.length; i++) {
            System.out.println(towSums[i]);
        }

    }

}
