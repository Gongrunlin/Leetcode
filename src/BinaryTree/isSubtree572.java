package BinaryTree;

import java.util.Stack;

public class isSubtree572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null) return false;
        if (subRoot == null && root != null) return false;
        //开始遍历

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while ( p != null || !stack.isEmpty()){
            if (p != null){
                if (p.val == subRoot.val){
                    if (isSameTree(p,subRoot)){
                        return true;
                    }
                }
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.pop();
                p = p.right;
            }
        }
        return false;
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
