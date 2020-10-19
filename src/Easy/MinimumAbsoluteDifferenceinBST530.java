package Easy;

import java.util.ArrayList;

/**
 * Created by tonyliu on 5/18/17.
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
 Note: There are at least two nodes in this BST.
 *
 */
public class MinimumAbsoluteDifferenceinBST530 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    public int getMinimumDifference(TreeNode root) {
        // get all element and push it to a arraylist
        //ArrayList<Integer> lists = new ArrayList<Integer>();


        return 0;
    }

    public int visitNode(TreeNode root) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        int left = visitNode(root.left);
        lists.add(left);
        int right = visitNode(root.right);
        lists.add(right);
        return root.val;
    }
}
