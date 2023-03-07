package Greed;

public class maxSubArray53 {
    public int maxSubArray(int[] nums) {
        //暴力解法
        int max = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > max){
                max = count;
            }
            if (count <= 0 ) count = 0;
        }
        return max;
    }
}
