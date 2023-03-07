package BinaryTree;

import java.util.List;

public class convertBST538 {
    int max;
    public TreeNode convertBST(TreeNode root) {
        max = 0;
        inorder(root);
        return root;
    }
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.right);
        max += root.val;
        root.val = max;
        inorder(root.left);
    }
}
