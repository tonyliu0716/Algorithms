package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 5/19/18.
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

 Note that the row index starts from 0.


 In Pascal's triangle, each number is the sum of the two numbers directly above it.

 Example:

 Input: 3
 Output: [1,3,3,1]


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
public class PascalsTriangleII_119 {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();

        for(int i = 0; i < rowIndex; i++) {
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

        return rows.get(rowIndex);
    }

    public static void main(String[] args) {

    }

}
