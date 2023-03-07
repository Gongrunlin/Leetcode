package Greed;

public class wiggleMaxLength376 {
    public static void main(String[] args) {

    }
    public static int wiggleMaxLength(int[] nums) {
        int result = 1;
        if (nums.length <= 1) return nums.length;
        int pre = 0,cur = 0;

        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] - nums[i-1];
            if ((cur > 0 && pre <= 0) || (cur < 0 && pre >= 0)){
                result++;
                pre = cur;
            }
        }
        return result;
    }




}
