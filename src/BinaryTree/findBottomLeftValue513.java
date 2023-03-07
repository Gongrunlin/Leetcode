package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class findBottomLeftValue513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int num = root.val;
        while (!queue.isEmpty()){
            int size = queue.size();
            num = queue.peek().val;
            while (size > 0){
                TreeNode p = queue.poll();
                if (p.left != null) queue.offer(p.left);
                if (p.right != null) queue.offer(p.right);
                size--;
            }
        }
        return num;
    }

}
