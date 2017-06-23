package ClassicAlgorithm;

/**
 * Created by tonyliu on 6/22/17.
 */
public class BinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    //前序
    public void preorder(TreeNode root) {
        if(root != null) {
            System.out.println(root.val);
        }
        if(root.left != null) {
            preorder(root.left);
        }
        if(root.right != null) {
            preorder(root.right);
        }

    }

    //中序
    public void inorder(TreeNode root) {
        if(root.left != null) {
            inorder(root.left);
        }

        System.out.println(root.val);

        if(root.right != null) {
            inorder(root.right);
        }
    }

    //后序
    public void postorder(TreeNode root) {
        if(root.left != null) {
            postorder(root.left);
        }

        if(root.right != null) {
            postorder(root.right);
        }

        System.out.println(root.val);
    }
}
