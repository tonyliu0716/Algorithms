package Easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by tao on 5/21/18.
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
     3
    / \
   9  20
     /  \
    15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class BinaryTreeLevelOrderTraversal_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> integers = new ArrayList<>();
        if(root == null) {
            return integers;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int length = queue.size();
            ArrayList<Integer> integer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                if(queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                integer.add(queue.poll().val);
            }
            integers.add(integer);
        }

        return integers;
    }

}
