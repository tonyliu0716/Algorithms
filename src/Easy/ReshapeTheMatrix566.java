package Easy;

/**
 * Created by tonyliu on 5/8/17.
 */
public class ReshapeTheMatrix566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length = 0;
        for(int i = 0; i < nums.length; i++) {
            int[] array = nums[i];
            length += array.length;
        }
        if(length != r * c) {
            return nums;
        } else {
            int [] arrs = new int[length];
            int count = 0;
            for(int i = 0; i < nums.length; i++) {
                int[] arr = nums[i];
                for (int j = 0; j < arr.length; j++) {
                     arrs[count] = arr[j];
                     count ++;
                }
            }

            //
            for(int i = 0; i < arrs.length; i++) {
                System.out.println(arrs[i]);
            }

            int[][] newNums = new int[r][];
            int count1 = 0;
            for(int i = 0; i < newNums.length; i++) {
                int[] newNum = new int[length / r];
                for(int j = 0; j < newNum.length; j++) {
                    newNum[j] = arrs[count1];
                    count1++;
                }
                newNums[i] = newNum;
            }
            return newNums;
        }

    }

    public static void main(String[] args) {
        ReshapeTheMatrix566 matrix = new ReshapeTheMatrix566();
        int[][] nums = new int[2][];
        nums[0] = new int[2];
        nums[1] = new int[2];
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[1][0] = 3;
        nums[1][1] = 4;
        matrix.matrixReshape(nums, 1, 4);
    }
}
