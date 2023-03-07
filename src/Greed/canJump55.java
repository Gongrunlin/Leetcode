package Greed;

public class canJump55 {
    public static void main(String[] args) {
        int[] a = {2,0,0};
        canJump(a);
    }

    public static boolean canJump(int[] nums) {
        int end = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (end >= i && nums[i] + i > end){
                end = i + nums[i];
            }
        }
        if (end >= nums.length - 1) return true;
        else return false;
    }
}
