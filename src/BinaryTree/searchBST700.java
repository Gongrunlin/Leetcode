package BinaryTree;

public class searchBST700 {
    public static void main(String[] args) {

    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if (root.val > val) return searchBST(root.left,val);
        if (root.val < val) return searchBST(root.right,val);
        return root;
    }
}
