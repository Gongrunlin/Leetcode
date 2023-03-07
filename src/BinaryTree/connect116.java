package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class connect116 {
    public static void main(String[] args) {

    }
    public Node2 connect(Node2 root) {
        Queue<Node2> queue = new LinkedList<>();
        if (root == null) return root;
        Node2 p = root;
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                if (size >1){//不是最右边那个结点
                    Node2 a1 = queue.poll();
                    Node2 a2 = queue.peek();
                    a1.next = a2;
                    if (a1.left != null) queue.offer(a1.next);
                    if (a1.right != null) queue.offer(a1.next);
                }
                else {//是最右边那个结点
                    Node2 a3 = queue.poll();
                    a3.next = null;
                    if (a3.left != null) queue.offer(a3.next);
                    if (a3.right != null) queue.offer(a3.next);
                }
                size--;
            }
        }
        return root;
    }
}

