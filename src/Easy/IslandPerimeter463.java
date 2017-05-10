package Easy;

/**
 * Created by tonyliu on 5/9/17.
 *
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 Example:

 [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

 Answer: 16
 *
 */
public class IslandPerimeter463 {

    public int islandPerimeter(int[][] grid) {
        // if we only have 1 grid
        if(grid[0].length == 1 && grid.length == 1) {
            if(grid[0][0] == 1) {
                return 4;
            }
            if(grid[0][0] == 0) {
                return 0;
            }
        }

        // if we have one horizontal line: [ [0, 1, 1, 0] ]
        if(grid.length == 1) {
            int[] firstRow = grid[0];
            int count1 = 0;
            for(int i = 0; i < firstRow.length; i++) {
                if(firstRow[i] == 1) {
                    count1 += 1;
                }
            }
            int horizontalLine = horizontalGrid(firstRow);
            return count1 * 2 + horizontalLine;
        }

        // if we have only one vertical line: [ [1], [1], [0] ]
        if(grid[0].length == 1) {
            int[] verticalRow = new int[grid.length];
            int count1 = 0;
            for(int i = 0; i < grid.length; i++) {
                verticalRow[i] = grid[i][0];
                if(verticalRow[i] == 1) {
                    count1 += 1;
                }
            }
            int verticalLine = horizontalGrid(verticalRow);
            return count1 * 2 + verticalLine;
        }

        int horizontalLine = 0;
        int countNums = 0;
        for(int i = 0; i < grid.length; i++) {
            horizontalLine += horizontalGrid(grid[i]);
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    countNums += 1;
                }
            }
        }
        int verticalLine = verticalGrid(grid);

        return horizontalLine + verticalLine;
    }

    //horizontal
    public int horizontalGrid(int[] arr) {
        int line = 0;
        if(arr[0] == 1) {
            line += 1;
        }
        if(arr.length != 1 && arr[arr.length - 1] == 1) {
            line += 1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                if( arr[i] != arr[i + 1] ) {
                    line += 1;
                }
            }
        }
        return line;
    }


    //vertical
    public int verticalGrid(int[][] grid) {

        int line = 0;
        for(int i = 0; i < grid[0].length; i++) {
            int[] newGrid = new int[grid.length];
            for(int j = 0; j < newGrid.length; j++) {
                newGrid[j] = grid[j][i];
            }
            line += horizontalGrid(newGrid);
        }

        return line;
    }

    public static void main(String[] args) {
        IslandPerimeter463 per = new IslandPerimeter463();
        int[][] grid = new int[4][];
        grid[0] = new int[]{0, 1, 0, 0};
        grid[1] = new int[]{1, 1, 1, 0};
        grid[2] = new int[]{0, 1, 0, 0};
        grid[3] = new int[]{1, 1, 0, 0};
        System.out.println(per.islandPerimeter(grid));
    }

}
