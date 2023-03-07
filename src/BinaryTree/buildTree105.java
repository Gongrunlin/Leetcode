package BinaryTree;

import java.util.Arrays;

public class buildTree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        TreeNode node = new TreeNode(preorder[0]);

        int i;
        for (i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) break;
        }

        int[] li = Arrays.copyOfRange(inorder,0,i);
        int[] lp = Arrays.copyOfRange(preorder,1,i+1);

        int[] ri = Arrays.copyOfRange(inorder,i+1,inorder.length);
        int[] rp = Arrays.copyOfRange(preorder,i+1,preorder.length);
        node.left = buildTree(lp,li);
        node.right = buildTree(rp,ri);
        return node;
    }
}
