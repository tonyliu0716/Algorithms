package Easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by tao on 5/21/18.
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 Example 1:
 Input:
      3
     / \
     9  20
       /  \
      15   7
 Output: [3, 14.5, 11]
 Explanation:
 The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 Note:
 The range of node's value is in the range of 32-bit signed integer.
 */
public class AverageofLevelsinBinaryTree_637 {

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();

        ArrayList<Double> doubles = new ArrayList<>();
        queue.add(root);
        double sumPerLevel = 0;
        while(!queue.isEmpty()) {
            int length = queue.size();
            for(int i = 0; i < length; i++) {
                if(queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                sumPerLevel += queue.poll().val;
            }

            doubles.add(sumPerLevel / length);
            System.out.println("doubles added: " + sumPerLevel / length);
            sumPerLevel = 0;
        }

        return doubles;
    }

    public static void main(String[] args) {
        AverageofLevelsinBinaryTree_637 tree = new AverageofLevelsinBinaryTree_637();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        List<Double> lists = tree.averageOfLevels(root);
        for(Double d : lists) {
            System.out.println(d);
        }
    }

}
