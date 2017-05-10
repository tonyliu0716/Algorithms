package Easy;

import java.util.HashMap;

/**
 * Created by tonyliu on 5/8/17.
 *
 * Input: candies = [1,1,2,2,3,3]
 Output: 3
 Explanation:
 There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
 Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
 The sister has three different kinds of candies.
 *
 */
public class DistributeCandies575 {

    public int distributeCandies(int[] candies) {

        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int i = 0; i < candies.length; i++) {
            maps.put(candies[i], candies[i]);
        }
        if(maps.size() >= candies.length / 2) {
            return candies.length / 2;
        } else {
            return maps.size();
        }

    }

}
