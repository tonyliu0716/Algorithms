package Easy;

/*
* You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

if n = 6;
1 + 1 + 1 + 1 + 1 + 1
1 + 2 + 1 + 1 + 1
1 + 2 + 2 + 1
2 + 2 + 2



Constraints:

1 <= n <= 45
*
* */

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs_70 {

    // recursive
    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n==0) {
            System.out.println("n = 0. return 1");
            return 1;
        }
        if(n<0) {
            System.out.println("n < 0. return 0");
            return 0;
        }
        if(map.containsKey(n)) {
            System.out.println("map contains " + n + ", return " + map.get(n));
            return map.get(n);
        }
        int ans = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, ans);
        System.out.println("map put " + n + ", " + ans);
        return ans;
    }

    // formula: step[n] = step[n - 1] + step[n - 2]
    // DP
    public int climbStairs2(int n) {

        if(n == 1) {
            return 1;
        }
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 2;
        for(int i = 2; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n - 1];

    }

    public static void main(String[] args) {
        ClimbingStairs_70 stair = new ClimbingStairs_70();
        int steps = stair.climbStairs2(4);
        System.out.println("steps: " + steps);
    }

}
