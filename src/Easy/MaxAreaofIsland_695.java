package Easy;

/**
 * Created by tao on 5/13/18.
 *
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

 Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

 Example 1:
 [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
 Example 2:
 [[0,0,0,0,0,0,0,0]]
 Given the above grid, return 0.
 Note: The length of each dimension in the given grid does not exceed 50.
 *
 */
public class MaxAreaofIsland_695 {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i=0; i < grid.length; i++)
            for(int j=0; j < grid[0].length; j++)
                maxArea = Math.max(maxArea, areaAt(grid, i, j));
        return maxArea;
    }

    private int areaAt(int[][] g, int x, int y){
        if(x < 0 || x >= g.length || y < 0 || y >= g[0].length || g[x][y] == 0 ) return 0;
        g[x][y] = 0; //visisted
        return 1+areaAt(g, x+1, y) + areaAt(g, x-1, y)+areaAt(g, x, y+1)+areaAt(g, x, y-1);
    }



    public static void main(String[] args) {

    }

}
