package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tao on 7/3/17.
 */
public class NumberOfBoomerangs447 {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<points.length; i++) {
            for(int j=0; j<points.length; j++) {
                if(i == j)
                    continue;

                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }

            for(int val : map.values()) {
                res += val * (val-1);
            }

            for(int val : map.values()) {
                System.out.println(val);
            }
            System.out.println("------clear the map-----");
            map.clear();
        }

        return res;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }


    public static void main(String[] args) {
        int[][] nums = new int[3][];
        nums[0] = new int[]{1, 0};
        nums[1] = new int[]{2, 0};
        nums[2] = new int[]{2, 1};

        NumberOfBoomerangs447 boomerangs447 = new NumberOfBoomerangs447();
        int res = boomerangs447.numberOfBoomerangs(nums);
        System.out.println("The answer is :" + res);
    }

}
