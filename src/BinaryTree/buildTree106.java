package BinaryTree;

import java.util.Arrays;

public class buildTree106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (postorder.length == 0) return null;

        //后序的最后一个结点就是根结点
        TreeNode node = new TreeNode(postorder[postorder.length - 1]);

        //划分左右子树，i的左边就是左子树，i的右边就是右子树
        int i;
        for (i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postorder.length - 1]){
                break;
            }
        }
        //获取左子树的中序和后序
        int[] li = Arrays.copyOfRange(inorder,0,i);
        int[] lp = Arrays.copyOfRange(postorder,0,i);

        //获取右子树的中序和后序
        int[] ri = Arrays.copyOfRange(inorder,i+1,inorder.length);
        int[] rp = Arrays.copyOfRange(postorder,i, postorder.length-1);

        //递归建立左右子树
        node.left = buildTree(li,lp);
        node.right = buildTree(ri,rp);
        return node;
    }
}
