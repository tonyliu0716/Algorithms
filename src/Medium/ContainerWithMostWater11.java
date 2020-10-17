package Medium;



/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.
*/
public class ContainerWithMostWater11 {

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++) {
            for(int j = 0; j < height.length; j++) {
                if(height[j] > height[i]) {
                    if (height[i] * (j - i) > max) {
                        max = height[i] * (j - i);
                    }
                } else {
                    if (height[j] * (j - i) > max) {
                        max = height[j] * (j - i);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater11().maxArea(height));
    }
    

}