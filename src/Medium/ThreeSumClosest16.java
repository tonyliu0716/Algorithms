package Medium;


public class ThreeSumClosest16 {
    
    public int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE; 
        int sum = 0;

        int dis = 0;
        int closest = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if((target <= 0 && sum <= 0) || (target >= 0 && sum >= 0)) {
                        dis = Math.abs(Math.abs(target) - Math.abs(sum));
                    } else if ((target >= 0 && sum <= 0) || (target <= 0 && sum >= 0)) {
                        dis = Math.abs(Math.abs(sum) + Math.abs(target));
                    }
                    if(dis < distance) {
                        distance = dis;
                        closest = sum;
                    }
                }
            }

        }
        
        return closest;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest16().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
