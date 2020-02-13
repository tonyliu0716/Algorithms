package Easy;

import java.util.Arrays;

/**
 * Created by tonyliu on 2020/2/12.
 */
public class FindNUniqueIntegersSumUpToZero1304 {

    public int[] sumZero(int n) {
        // n = 5 [-2, -1, 0, 1, 2]
        // n = 6 [1, -1, 2, -2, 3, -3]
        if(n == 1) {
            return new int[]{0};
        }
        int[] nums = new int[n];
        if(n % 2 == 0) {
            for(int i = 0; i < n / 2; i++) {
                nums[i] = i + 1;
            }
            for(int i = n / 2; i < n; i++) {
                nums[i] = (-1) * nums[n - i - 1];
            }
            Arrays.sort(nums);
        } else {
            nums[0] = 0;
            for(int i = 1; i < n; i += 2) {
                nums[i] = i;
                nums[i + 1] = (-1) * i;
            }
            Arrays.sort(nums);
        }
        return nums;
    }

    public static void main(String[] args) {
        FindNUniqueIntegersSumUpToZero1304 zero = new FindNUniqueIntegersSumUpToZero1304();
        int[] nums = zero.sumZero(11);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
