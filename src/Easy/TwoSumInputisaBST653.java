package Easy;

import java.util.ArrayList;

/**
 * Created by tonyliu on 2018/1/18.
 *
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:
 Input:
   5
  / \
 3   6
 / \   \
 2   4   7

 Target = 9

 Output: True
 Example 2:
 Input:
   5
  / \
 3   6
 / \   \
 2   4   7

 Target = 28

 Output: False
 *
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class TwoSumInputisaBST653 {



    private ArrayList<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        if(root.val == 0 && root.left == null && root.right == null) {
            if(k == 0) {
                return true;
            } else {
                return false;
            }
        }

        if(root != null) {
            preorder(root);
            for(int i = 0; i < list.size(); i++) {
                for(int j = 1; j < list.size(); j++) {
                    if(list.get(i) == list.get(j)) {
                        continue;
                    }
                    if(list.get(i) == null || list.get(j) == null) {
                        continue;
                    }
                    if(list.get(i) + list.get(j) == k) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void preorder(TreeNode root) {
        if(root != null) {
            list.add(root.val);
        }
        if(root.left != null) {
            preorder(root.left);
        }
        if(root.right != null) {
            preorder(root.right);
        }

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        node.left = node3;
        node.right = node6;

        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);

        node3.left = node2;
        node3.right = node4;

        TreeNode node7 = new TreeNode(7);

        node6.right = node7;

        TreeNode root = new TreeNode(2);
        TreeNode node31 = new TreeNode(3);
        root.left = node31;

        TwoSumInputisaBST653 bst = new TwoSumInputisaBST653();
        System.out.println( bst.findTarget(root, 6) );
    }

}
