package BinaryTree;

public class maxDepth104 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepth(root.right)>maxDepth(root.left)?maxDepth(root.right)+1:maxDepth(root.left)+1;
    }
}
