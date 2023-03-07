package BinaryTree;

import java.util.Stack;

public class isBalanced110 {
    public boolean isBalanced(TreeNode root) {
        Boolean flage = true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while ( p != null || !stack.isEmpty()){
            if (p != null){
                if (Math.abs(maxDepth(p.right)-maxDepth(p.right)) >=2 ){
                    flage = false;
                    break;
                }
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.pop();
                p = p.right;
            }
        }
        return flage;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.right),maxDepth(root.left)) + 1;
    }
}


