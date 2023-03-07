package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class sumOfLeftLeaves404 {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        preorder(root);
        return sum;
    }
    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.left.left != null && root.left.right != null){
            sum += root.left.val;
        }
        preorder(root.left);
        preorder(root.right);
    }


}
