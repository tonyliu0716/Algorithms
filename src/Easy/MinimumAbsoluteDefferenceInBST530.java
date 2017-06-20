package Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tao on 6/20/17.
 *
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

 1
   \
    3
   /
 2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 *
 */
public class MinimumAbsoluteDefferenceInBST530 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private ArrayList<Integer> lists = new ArrayList<Integer>();


    public int getMinimumDifference(TreeNode root) {
        preorder(root);
        Object[] allVal = lists.toArray();
        for(Object val : allVal) {
            System.out.println(val);
        }
        Arrays.sort(allVal);
        int min = 0;
        if(allVal.length == 2) {
            return Math.abs(Integer.parseInt(allVal[0] + "") - Integer.parseInt(allVal[1] + ""));
        } else {
            min = Math.abs( Integer.parseInt(allVal[0] + "") - Integer.parseInt(allVal[1] + ""));
            for(int i = 0; i < allVal.length - 1; i++) {
                int distance = Math.abs(Integer.parseInt(allVal[i] + "") - Integer.parseInt(allVal[i + 1] + ""));
                if(distance < min) {
                    min = distance;
                }
            }
        }
        return min;
    }

    public void preorder(TreeNode root) {
        if(root != null) {
            lists.add(root.val);
        }
        if(root.left != null) {
            preorder(root.left);
        }
        if(root.right != null) {
            preorder(root.right);
        }
    }

}
