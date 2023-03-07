package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class largestValues515 {
    public static void main(String[] args) {

    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            int max = queue.peek().val;
            while (size > 0){
                TreeNode node = queue.poll();
                int val = node.val;
                if (max < val){
                    max = val;
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size--;
            }
            list.add(max);
        }
        return list;
    }
}
