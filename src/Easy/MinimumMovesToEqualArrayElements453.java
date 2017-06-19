package Easy;

/**
 * Created by tao on 5/25/17.
 *
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

 Example:

 Input:
 [1,2,3]

 Output:
 3

 Explanation:
 Only three moves are needed (remember each move increments two elements):

 [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 *
 *
 */
public class MinimumMovesToEqualArrayElements453 {

    public int minMoves(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }

        if(nums.length == 2) {
            return Math.abs(nums[0] - nums[1]);
        }

        if(findMaxIndex(nums)[1] == nums.length - 1) {
            int maxIndex = findMaxIndex(nums)[0];
            if(maxIndex != 0) {
                return Math.abs(nums[maxIndex] - nums[0]);
            } else {
                return Math.abs(nums[maxIndex] - nums[1]);
            }

        }

        int count = 0;
        while(!ifAllElementsEquals(nums)) {
            int maxIndex = findMaxIndex(nums)[0];
            increaseByOne(nums, maxIndex);
            count++;
        }

        return count;
    }

    public boolean ifAllElementsEquals(int[] nums) {
        int flag = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != flag) {
                break;
            } else {
                count++;
            }
        }
        if(count == nums.length) {
            return true;
        } else {
            return false;
        }
    }

    public int[] findMaxIndex(int[] nums) {
        int maxIndex = 0;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                maxIndex = i + 1;
            }
            // which means except the largest one, all the others are the same

        }
        System.out.println(count + " are the same");


        return new int[]{maxIndex, count};
    }

    // increase all the element except the max one:
    public void increaseByOne(int[] nums, int maxIndex) {
        for(int i = 0; i < nums.length; i++) {
            if(i != maxIndex) {
                nums[i] = nums[i] + 1;
            }
        }
    }



    public static void main(String[] args) {
        MinimumMovesToEqualArrayElements453 min = new MinimumMovesToEqualArrayElements453();
        int[] nums = new int[]{1, 1,2147483647};
        System.out.println( min.minMoves(nums) );

    }
}
