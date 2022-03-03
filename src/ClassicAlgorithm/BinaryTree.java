package ClassicAlgorithm;

/**
 * Created by tonyliu on 6/22/17.
 *           G
 *         /  \
 *        D    M
 *       / \  / \
 *      A  F  H  Z
 *        /
 *       E
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
    //访问顺序：先根节点，再左子树，最后右子树；上图的访问结果为：GDAFEMHZ。
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
    //访问顺序：先左子树，再根节点，最后右子树；上图的访问结果为：ADEFGHMZ。
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
    //访问顺序：先左子树，再右子树，最后根节点，上图的访问结果为：AEFDHZMG。
    public void postorder(TreeNode root) {
        if(root.left != null) {
            postorder(root.left);
        }

        if(root.right != null) {
            postorder(root.right);
        }

        System.out.println(root.val);
    }

    public static void main(String[] args) {

    }

}
