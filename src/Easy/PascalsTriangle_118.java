package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 5/18/18.
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


 In Pascal's triangle, each number is the sum of the two numbers directly above it.

 Example:

 Input: 5
 Output:
 [
      [1],   -  0
     [1,1],  -  1
    [1,2,1], -  2
   [1,3,3,1],-  3
  [1,4,6,4,1]-  4
 ]


 */

public class PascalsTriangle_118 {

    // every element: numRows[i][j] = numRows[i - 1][j - 1] + numRows[i - 1][j]
    //                numRows[2][1] = numRows[1][0] + numRows[1][1];
    //                numRows[3][2] = numRows[2][1] + numRows[2][2];
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int length = i + 1;
            for(int j = 0; j < length; j++) {
                if(j == 0 || j == length - 1) {
                    row.add(1);
                    System.out.println("row " + i + " added " + 1);
                } else {
                  row.add(rows.get(i - 1).get(j - 1) + rows.get(i - 1).get(j));
                }
            }
            System.out.println("added row");
            rows.add(row);
        }

        return rows;
    }

    public static void main(String[] args) {
        PascalsTriangle_118 triangle = new PascalsTriangle_118();
        List<List<Integer>> numRows = triangle.generate(5);
        for(List<Integer> list : numRows) {
            for(Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
