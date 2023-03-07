package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class hasPathSum112 {
    public static void main(String[] args) {

    }
    private static List<Integer> list = new ArrayList<>();
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root,0);
        return list.contains(targetSum);
    }
    private static void dfs(TreeNode root,int sum){
        if (root == null) return;
        sum += root.val;
        if (root.right == null && root.left == null){
            list.add(sum);
            return;
        }
        if (root.left != null){
            dfs(root.left, sum);
        }
        if (root.right != null){
            dfs(root.right, sum);
        }
    }
}
