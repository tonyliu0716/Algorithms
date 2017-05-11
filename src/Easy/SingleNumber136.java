package Easy;

/**
 * Created by tonyliu on 5/9/17.
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 */
public class SingleNumber136 {

    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                    if(count == 2) {
                        break;
                    }
                }
            }
            if(count == 1) {
                single = nums[i];
                break;
            }
        }

        return single;
    }

}
