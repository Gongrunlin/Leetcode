package BinaryTree;


import BinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder102 {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        a1.left = a2;
        a1.right = a3;
        levelOrder(a1);


    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return result;

        TreeNode p =root;

        queue.offer(p);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0){
                TreeNode m = queue.poll();
                list.add(m.val);
                if (m.left != null) queue.offer(m.left);
                if (m.right != null) queue.offer(m.right);
                size--;
            }
//            System.out.println(list);
            result.add(list);

        }
        return result;
    }

}

