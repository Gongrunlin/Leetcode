package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class getMinimumDifference530 {

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        get(root,result);
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
        int[] b = new int[a.length-1];
        for (int i = 1; i < a.length; i++) {
            b[i-1] = a[i] - a[i-1];
        }
        Arrays.sort(b);
        return b[0];
    }
    public static void get(TreeNode root,List<Integer> result){
        if (root==null) return;
        get(root.left,result);
        result.add(root.val);
        get(root.right,result);
    }
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
        System.out.println(getMinimumDifference(n1));

    }

}
