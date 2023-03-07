package BinaryTree;

public class invertTree226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        invertTree(root.right);
        invertTree(root.left);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        return  root;
    }
}
