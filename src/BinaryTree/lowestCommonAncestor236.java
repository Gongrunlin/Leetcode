package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lowestCommonAncestor236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null && right == null) { // 若未找到节点 p 或 q
            return null;
        }else if(left == null && right != null) { // 若找到一个节点
            return right;
        }else if(left != null && right == null) { // 若找到一个节点
            return left;
        }else { // 若找到两个节点
            return root;
        }


    }



    /**
     * my
     * @param args
     */
//    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        int depth = maxDepth(root);
//        int a[] = new int[(int)Math.pow(2,depth)-1];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = -99999;
//        }
//        getTree(root,a,0);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        int p_location = 0;
//        int q_location = 0;
//        //获取p,q的位置
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == p.val) p_location = i;
//            if (a[i] == q.val) q_location = i;
//        }
//
//        System.out.println("--------------");
//        System.out.println("P_location" + p_location);
//        System.out.println("q_location" + q_location);
//
//        //获取祖先位置信息
//        while (p_location!=q_location){
//            if (p_location>q_location){
//                if (p_location%2 == 0){
//                    p_location = p_location/2-1;
//                }else {
//                    p_location = p_location/2;
//                }
//            }
//            if (p_location<q_location){
//               if (q_location%2 == 0){
//                   q_location = q_location/2-1;
//               }else {
//                   q_location = q_location/2;
//               }
//            }
//        }
//
//        System.out.println("P_location" + p_location);
//        System.out.println("q_location" + q_location);
//        int rs = a[p_location];
//        System.out.println("123123"+rs);
//        return search(root,rs);
//    }
//    public static TreeNode search(TreeNode root, int val) {
//        if (root == null) return null ;
//        if(root.val == val) return root;
//        if (search(root.right,val)!=null) return search(root.right,val);
//        return search(root.left,val);
//    }
//    public static void getTree(TreeNode root,int[] a ,int i){
//        if (root == null) return;
//        a[i] = root.val;
//        if (root.left!=null) getTree(root.left,a,2*i+1);
//        if (root.right!=null) getTree(root.right,a,2*i+2);
//    }
//    public static int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        return maxDepth(root.right)>maxDepth(root.left)?maxDepth(root.right)+1:maxDepth(root.left)+1;
//    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(236);
        TreeNode n2 = new TreeNode(104);
        TreeNode n3 = new TreeNode(701);
        TreeNode n4 = new TreeNode(227);
        TreeNode n5 = new TreeNode(911);
        n1.right = n3;
        n1.left = n2;
        n2.right = n4;
        n3.right = n5;
//        System.out.println(lowestCommonAncestor(n1, n2, n5).val);
    }



}





