package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class minDepth111 {
    public static void main(String[] args) {

    }
//    public int minDepth(TreeNode root) {
//        if (root == null) return 0;
//        int right = minDepth(root.right);
//        int left = minDepth(root.left);
//        return right>left?left+1:right+1;
//    }
public int minDepth(TreeNode root){

    /**
     * 递归方法
     */

    if (root == null) return 0;

    int left = minDepth(root.left);
    int right = minDepth(root.right);



    if (root.left==null&&root.right!=null){
        return 1+minDepth(root.right);
    }
    if (root.right==null&&root.left!=null){
        return 1+minDepth(root.left);
    }

    int depth = 1 + Math.min(left,right);
    return depth;




    /**
     * 非递归方法
     */
//    if (root == null) {
//        return 0;
//    }
//    Queue<TreeNode> queue = new LinkedList<>();
//    queue.offer(root);
//    int depth = 0;
//    while (!queue.isEmpty()){
//        int size = queue.size();
//        depth++;
//        TreeNode cur = null;
//        for (int i = 0; i < size; i++) {
//            cur = queue.poll();
//            //如果当前节点的左右孩子都为空，直接返回最小深度
//            if (cur.left == null && cur.right == null){
//                return depth;
//            }
//            if (cur.left != null) queue.offer(cur.left);
//            if (cur.right != null) queue.offer(cur.right);
//        }
//    }
//    return depth;
}

}

