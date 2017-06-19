package Easy;

/**
 * Created by tao on 6/19/17.
 *
 * Find the sum of all left leaves in a given binary tree.

 Example:

 3
 / \
 9  20
 /  \
 15   7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves404 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

   private int sum = 0;

   public int sumOfLeftLeaves(TreeNode root) {

        if(root.left == null && root.right == null) {

        }

        return 0;


   }

}
