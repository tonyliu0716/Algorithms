package Easy;

/**
 * Created by tonyliu on 2020/2/6.
 */
public class FindNumbersWithEvenNumberOfDigits1295 {

    public int findNumbers(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if(sb.length() % 2 == 0) {
                count++;
            }
            sb.setLength(0);
        }
        return count;
    }

}
