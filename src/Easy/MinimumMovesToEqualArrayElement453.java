package Easy;

import java.util.Arrays;

/**
 * Created by tonyliu on 5/25/17.
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
 * something...
 */
public class MinimumMovesToEqualArrayElement453 {

    public int minMoves(int[] nums) {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
        }
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i]-small;
        }
        return sum;

    }



    public static void main(String[] args) {
        MinimumMovesToEqualArrayElement453 min = new MinimumMovesToEqualArrayElement453();
        int[] nums = new int[]{1, 2, 3};
        System.out.println( min.minMoves(nums) );


    }

}
