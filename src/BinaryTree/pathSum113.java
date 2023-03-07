package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class pathSum113 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, 0, sum);
        return res;
    }
    public void dfs(TreeNode root, int num, int sum){
        if(root == null) return;
        num += root.val;
        list.add(root.val);
        if(num == sum && root.left == null && root.right == null) res.add(new ArrayList(list));
        dfs(root.left, num, sum);
        dfs(root.right, num, sum);
        list.remove(list.size() - 1);
    }
}
