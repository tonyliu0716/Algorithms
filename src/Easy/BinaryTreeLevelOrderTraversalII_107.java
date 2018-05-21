package Easy;

/**
 * Created by tao on 5/20/18.
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
     3
    / \
   9  20
     /  \
    15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 *
 *
 *      3
       / \
      9  20
        /  \
       15   7
 */

public class BinaryTreeLevelOrderTraversalII_107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            for(Integer i : subList) {
                System.out.print(i + " ");
            }
            wrapList.add(0, subList);
            System.out.println();
        }
        return wrapList;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversalII_107 order = new BinaryTreeLevelOrderTraversalII_107();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(12);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node1.left = node5;
        node1.right = node6;

        order.levelOrderBottom(root);
    }

}
