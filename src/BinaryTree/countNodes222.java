package BinaryTree;

import java.util.Stack;

public class countNodes222 {
//    public int countNodes(TreeNode root) {
//        int depth = 0;
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode p = root;
//        while ( p != null || !stack.isEmpty()){
//            if (p != null){
//                depth++;
//                stack.push(p);
//                p = p.left;
//            }
//            else {
//                p = stack.pop();
//                p = p.right;
//            }
//        }
//        return depth;
//    }
public int countNodes(TreeNode root) {
    if(root == null) {
        return 0;
    }
    return countNodes(root.left) + countNodes(root.right) + 1;
}
}
