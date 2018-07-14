package Easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by tao on 5/19/18.
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

     1
    / \
   2   2
  / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
 Note:
 Bonus points if you could solve it both recursively and iteratively.
 *
 */

public class SymmetricTree_101 {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }


    public static void main(String[] args) {
        //System.out.println((int)Math.pow(2, 3));
        //[1,2,2,3,4,4,3]
        TreeNode node1 = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);

        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        SymmetricTree_101 tree = new SymmetricTree_101();
        System.out.println("return :" + tree.isSymmetric(node1));

    }

}
