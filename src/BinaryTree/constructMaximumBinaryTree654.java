package BinaryTree;

import java.util.Arrays;

public class constructMaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) return null;
        int max = nums[0];
        int max_l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
                max_l = i;
            }
        }
        TreeNode node = new TreeNode(max);
        int[] l = Arrays.copyOfRange(nums,0,max_l);
        int[] r = Arrays.copyOfRange(nums,max_l+1,nums.length);
        node.left = constructMaximumBinaryTree(l);
        node.right = constructMaximumBinaryTree(r);
        return node;
    }
}
