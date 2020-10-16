package Easy;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonyliu on 2018/1/23.
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
 *
 */

public class Average_of_Levels_in_Binary_Tree_637 {


    private List<Integer> value = new ArrayList<>();
    private List<Integer> level = new ArrayList<>();
    int levelCount = 0;
    int preCount = 0;

    public List<Double> averageOfLevels(TreeNode root) {

        preOrder(root);

        // indicate the sum of the same level number
        int sum = 0;

        // indicate how many number of node in the same level
        int levelNumCount = 1;

        List<Double> average = new ArrayList<>();
        for(int i = 0; i < level.size(); i++) {
            if(i == level.size() - 1) {
                break;
            }
            if(level.get(i) != level.get(i + 1)) {
                sum += value.get(i);
                average.add((double) Math.round( ((double)sum / (double) levelNumCount * 100) / 100.0));
                levelNumCount = 1;
                sum = 0;
                if(i == level.size() - 2) {
                    sum += value.get(i + 1);
                    average.add((double) Math.round( ((double)sum / (double) levelNumCount * 100) / 100.0));
                }
            } else {
                sum += value.get(i);
                levelNumCount ++;
                if(i == level.size() - 2) {
                    sum += value.get(i + 1);
                    average.add((double) Math.round( ((double)sum / (double) levelNumCount * 100) / 100.0));
                }
            }

        }

        return average;
    }

    public void preOrder(TreeNode root) {
        if(root != null) {
            value.add(root.val);
            level.add(levelCount);

            if(root.left == null && root.right == null) {
                levelCount = preCount;
            }

        }

        if(root.left != null) {
            preCount = levelCount;
            levelCount++;
            preOrder(root.left);
        }
        if(root.right != null) {
            preCount = levelCount;
            levelCount ++;
            preOrder(root.right);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        root.left = node9;
        root.right = node2;
        node9.left = node15;
        node9.right = node7;

        Average_of_Levels_in_Binary_Tree_637 tree = new Average_of_Levels_in_Binary_Tree_637();
        List<Double> averageNodes = tree.averageOfLevels(root);

        List<Integer> level = tree.level;
        List<Integer> value = tree.value;
        for(int val : value) {
            System.out.print(val + ", ");
        }
        System.out.println();
        for(int le : level) {
            System.out.print(le + ", ");
        }

        System.out.println();
        for(double d: averageNodes) {
            System.out.print(d + ", ");
        }

    }

}
