package Easy;

/**
 * Created by tao on 5/21/18.
 *
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
     3
    / \
   9  20
     /  \
    15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
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
 */

public class BinaryTreeZigzagLevelOrderTraversal_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);
        Boolean flag = true;

        while(!queue.isEmpty()){

            List<Integer> sublist = new LinkedList<Integer>();
            int size = queue.size();

            for(int i =0;i<size;i++){
                TreeNode top = queue.peek();
                if(top.left!=null)
                    queue.offer(top.left);
                if(top.right!=null)
                    queue.offer(top.right);
                if(flag)
                    sublist.add(queue.poll().val);
                else
                    sublist.add(0,queue.poll().val);
            }
            result.add(sublist);
            if(flag == true)
                flag = false;
            else
                flag = true;
        }

        return result;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node2.right = node4;

        BinaryTreeZigzagLevelOrderTraversal_103 tree = new BinaryTreeZigzagLevelOrderTraversal_103();
        List<List<Integer>> integers = tree.zigzagLevelOrder(root);
        for(List<Integer> list: integers) {
            for(Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
