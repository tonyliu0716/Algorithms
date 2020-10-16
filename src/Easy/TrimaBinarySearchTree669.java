package Easy;


/**
 * Created by tonyliu on 2018/1/19.
 *
 * Given a binary search tree and the lowest and highest boundaries as L and R,
 * trim the tree so that all its elements lies in [L, R] (R >= L).
 * You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

 Example 1:
 Input:
  1
  / \
 0   2

 L = 1
 R = 2

 Output:
 1
 \
  2
 Example 2:
 Input:
   3
  / \
 0   4
  \
   2
  /
 1

 L = 1
 R = 3

 Output:
     3
    /
   2
  /
 1
 *
 */

class TreeNodeFor669 {
      int val;
      TreeNodeFor669 left;
      TreeNodeFor669  right;
      TreeNodeFor669(int x) { val = x; }
}

public class TrimaBinarySearchTree669 {

    //private ArrayList<Integer> list = new ArrayList<>();

    public TreeNodeFor669 trimBST(TreeNodeFor669 root, int L, int R) {
        if (root == null) return root;
        if (root.val > R) return trimBST(root.left, L, R);
        if (root.val < L) return trimBST(root.right, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;

    }


    public static void main(String[] args) {
        TrimaBinarySearchTree669 tree = new TrimaBinarySearchTree669();

        TreeNodeFor669 node0 = new TreeNodeFor669(0);
        TreeNodeFor669 node1 = new TreeNodeFor669(1);
        TreeNodeFor669 node2 = new TreeNodeFor669(2);
        TreeNodeFor669 node3 = new TreeNodeFor669(3);
        TreeNodeFor669 node4 = new TreeNodeFor669(4);

        node3.left = node0;
        node3.right = node4;
        node0.right = node2;
        node2.left = node1;

        tree.trimBST(node3, 1, 3);
    }

}
