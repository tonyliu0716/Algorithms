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

class TreeNodeFor653 {
    int val;
    TreeNodeFor653 left;
    TreeNodeFor653 right;
    TreeNodeFor653(int x) { val = x; }
}

public class TwoSumInputisaBST653 {



    private ArrayList<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNodeFor653 root, int k) {
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

    public void preorder(TreeNodeFor653 root) {
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
        TreeNodeFor653 node = new TreeNodeFor653(5);
        TreeNodeFor653 node3 = new TreeNodeFor653(3);
        TreeNodeFor653 node6 = new TreeNodeFor653(6);
        node.left = node3;
        node.right = node6;

        TreeNodeFor653 node2 = new TreeNodeFor653(2);
        TreeNodeFor653 node4 = new TreeNodeFor653(4);

        node3.left = node2;
        node3.right = node4;

        TreeNodeFor653 node7 = new TreeNodeFor653(7);

        node6.right = node7;

        TreeNodeFor653 root = new TreeNodeFor653(2);
        TreeNodeFor653 node31 = new TreeNodeFor653(3);
        root.left = node31;

        TwoSumInputisaBST653 bst = new TwoSumInputisaBST653();
        System.out.println( bst.findTarget(root, 6) );
    }

}
