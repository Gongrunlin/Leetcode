package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths257 {
    private  List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,new StringBuilder());
        return list;
    }
    private void dfs(TreeNode root,StringBuilder sb){
        if (root == null) return;
        sb.append(root.val);
        if (root.right == null && root.left == null){
            list.add(sb.toString());
            return;
        }
        if (root.left != null) {
            dfs(root.left,new StringBuilder(sb).append("->"));
        }
        if (root.right != null){
            dfs(root.right,new StringBuilder(sb).append("->"));
        }
    }
}
