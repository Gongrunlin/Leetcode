package BinaryTree;

public class insertIntoBST701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }
        if (root.val > val && root.left == null){
            root.left = insertIntoBST(root.left,val);
        }
        if (root.val < val && root.right == null){
            root.right = insertIntoBST(root.right,val);
        }
        if (root.val > val){
            insertIntoBST(root.left,val);
        }
        if (root.val < val){
            insertIntoBST(root.right,val);
        }
        return root;
    }
}
