package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder429 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) return result;
        queue.offer(root);
        Node p = root;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size>0){
                Node m = queue.poll();
                for (Node child : m.children) {
                    queue.offer(child);
                }
                list.add(m.val);
                size--;
            }
            result.add(list);
        }
        return result;
    }
}
