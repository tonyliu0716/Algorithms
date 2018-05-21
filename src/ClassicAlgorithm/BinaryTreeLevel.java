package ClassicAlgorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by tao on 5/21/18.
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeLevel {

    // key: use for loop to loop over each layer of the binary tree
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        // use linked list to keep the layers' information
        LinkedList<List<Integer>> wrapList = new LinkedList<>();
        while(!queue.isEmpty()) {
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
            // add it to the beginning of the linked list
            wrapList.add(0, subList);
            System.out.println();
        }

        return wrapList;
    }

}
