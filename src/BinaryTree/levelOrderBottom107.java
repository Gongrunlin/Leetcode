package BinaryTree;

import java.util.*;

public class levelOrderBottom107 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Stack<List<Integer>> stack = new Stack<>();
        List<List<Integer>> result2 = new ArrayList<>();

        for (List<Integer> list : result) {
            stack.push(list);
        }

        while (!stack.isEmpty()){
            result2.add(stack.pop());
        }
        return result2;
    }
}
