package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class isSameTree100 {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        if (p == null && q == null) return true;
        if (p.val != q.val) return false;
        boolean right = isSameTree(p.right,q.right);
        boolean left = isSameTree(p.left,q.left);
        return right&&left;
    }
}
