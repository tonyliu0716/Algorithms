package Easy;

/**
 * Created by tao on 5/21/18.
 *
 * Given two non-empty binary trees s and t,
 * check whether tree t has exactly the same structure and node values with a subtree of s.
 * A subtree of s is a tree consists of a node in s and all of this node's descendants.
 * The tree s could also be considered as a subtree of itself.

 Example 1:
 Given tree s:

     3
    / \
   4   5
  / \
 1   2
 Given tree t:
   4
  / \
 1   2
 Return true, because t has the same structure and node values with a subtree of s.
 Example 2:
 Given tree s:

       3
      / \
     4   5
    / \
   1   2
  /
 0
 Given tree t:
   4
  / \
 1   2
 Return false.
 *
 */

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SubtreeofAnotherTree_572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        String spreorder = generatepreorderString(s);
        String tpreorder = generatepreorderString(t);

        return spreorder.contains(tpreorder) ;
    }


    public String generatepreorderString(TreeNode s){
        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> stacktree = new Stack();
        stacktree.push(s);
        while(!stacktree.isEmpty()){
            TreeNode popelem = stacktree.pop();
            if(popelem==null)
                sb.append(",#"); // Appending # inorder to handle same values but not subtree cases
            else
                sb.append(","+popelem.val);
            if(popelem!=null){
                stacktree.push(popelem.right);
                stacktree.push(popelem.left);
            }
            System.out.println(sb + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode node7 = new TreeNode(0);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node7;


        TreeNode root1 = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(2);

        root1.left = node5;
        root1.right = node6;

        SubtreeofAnotherTree_572 sub = new SubtreeofAnotherTree_572();
        System.out.println( sub.isSubtree(root, root1) );
    }

}
