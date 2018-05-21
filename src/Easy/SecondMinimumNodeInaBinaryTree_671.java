package Easy;

/**
 * Created by tao on 5/20/18.
 *
 * Given a non-empty special binary tree consisting of nodes with the non-negative value,
 * where each node in this tree has exactly two or zero sub-node.
 * If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.

 Given such a binary tree,
 you need to output the second minimum value in the set made of all the nodes' value in the whole tree.

 If no such second minimum value exists, output -1 instead.

 Example 1:
 Input:
     2
    / \
   2   5
  / \
 5   7

 Output: 5
 Explanation: The smallest value is 2, the second smallest value is 5.
 Example 2:
 Input:
   2
  / \
 2   2

 Output: -1
 Explanation: The smallest value is 2, but there isn't any second smallest value.
 *
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SecondMinimumNodeInaBinaryTree_671 {

    public int findSecondMinimumValue(TreeNode root) {

        if(root.left == null && root.right == null) {
            return -1;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        Set<Integer> sets = new HashSet<>();
        while(!queue.isEmpty()){
            TreeNode node=queue.remove();
            sets.add(node.val);
            //System.out.print(node.val + " ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        if(sets.size() == 1) {
            return -1;
        }

        Object[] objs = sets.toArray();
        Arrays.sort(objs);
        for(Object obj: objs) {
            System.out.print(obj.toString() + " ");
        }

        return Integer.valueOf(objs[1].toString());
    }

    public static void main(String[] args) {

    }

}
