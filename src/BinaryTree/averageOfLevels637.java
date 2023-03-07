package BinaryTree;

import java.util.*;

public class averageOfLevels637 {
    public static void main(String[] args) {

    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;
        TreeNode p =root;
        queue.offer(p);
        while (!queue.isEmpty()){
            int size = queue.size();
            int len = size;
            Double sum = 0.0;

            while (size > 0){
                TreeNode m = queue.poll();
                sum += m.val;
                if (m.left != null) queue.offer(m.left);
                if (m.right != null) queue.offer(m.right);
                size--;
            }
            result.add(sum/len);
        }
        return result;
    }
}
