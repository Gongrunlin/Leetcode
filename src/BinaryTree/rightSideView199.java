package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideView199 {
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list;
        TreeNode p =root;
        queue.offer(p);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                TreeNode m = queue.poll();
                if (size == 1){
                    list.add(m.val);
                }
                if (m.left != null) queue.offer(m.left);
                if (m.right != null) queue.offer(m.right);
                size--;
            }
        }
        return list;
    }
}
