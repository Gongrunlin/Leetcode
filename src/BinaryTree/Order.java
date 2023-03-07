package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Order {

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        a1.left = a2;
        a1.right = a3;
        postorder(a1);
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(a1);
//        stack.push(a2);
//        TreeNode p2 = stack.pop();
//        System.out.println(p2.val);


    }

    public static void preorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while ( p != null || !stack.isEmpty()){
            if (p != null){
                System.out.println(p.val);
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.pop();
                p = p.right;
            }
        }
    }

    //中序遍历
    public static void inoder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while ( p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.pop();
                System.out.println(p.val);
                p = p.right;
            }
        }
    }

    //后序遍历
    public static void postorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode r = null;//记录刚刚是否被访问过的结点
        while ( p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.peek();
                if (p.right!=null && p.right != r){
                    p = p.right;
                }
                else {
                    p = stack.pop();
                    System.out.println(p.val);
                    r = p;
                    p = null;
                }
            }
        }
    }






}

//二叉树存储结构
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
