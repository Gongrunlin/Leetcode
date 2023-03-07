package Array_exercise;

public class searchRange34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        Solution s = new Solution();
        System.out.println(s.searchRange(nums, 8)[0]);
        System.out.println(s.searchRange(nums, 8)[1]);
    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] res = {-1,-1};

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    res[0] = i;
                }
            }
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] == target){
                    res[1] = j;
                }
            }
            return res;
        }
    }
}
