package BinaryTree;

import java.util.Arrays;

public class sortedArrayToBST108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode node = new TreeNode(nums[nums.length/2]);
        int[] left_num = Arrays.copyOfRange(nums,0,nums.length/2);
        int[] right_num = Arrays.copyOfRange(nums,nums.length/2+1,nums.length);
        node.right = sortedArrayToBST(right_num);
        node.left = sortedArrayToBST(left_num);
        return node;
    }

    
}
