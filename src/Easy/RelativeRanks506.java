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


        // newNums: [10, 9, 8, 4, 3]  i
        // nums:    [10, 3, 8, 9, 4]  j
        // ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
        int[] newNums = new int[nums.length];
        for(int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i];
        }

        for(int i = 0; i < newNums.length; i++) {
            for(int j = i; j < newNums.length; j++) {
                if(newNums[i] < newNums[j]) {
                    int temp = newNums[i];
                    newNums[i] = newNums[j];
                    newNums[j] = temp;
                }
            }
        }

        String[] string = new String[nums.length];
        for(int i = 0; i < newNums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(newNums[i] == nums[j]) {
                    string[j] = i + 1 + "";
                    if(string[j].equals("1")) {
                        string[j] = "Gold Medal";
                    }
                    if(string[j].equals("2")) {
                        string[j] = "Silver Medal";
                    }
                    if(string[j].equals("3")) {
                        string[j] = "Bronze Medal";
                    }
                    break;
                }

            }
        }




        return string;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        RelativeRanks506 rank = new RelativeRanks506();
        String[] strings = rank.findRelativeRanks(nums);
        for(String s : strings) {
            System.out.println(s);
        }

    }
}
