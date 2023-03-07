package Array_exercise;

public class Search_Inserch35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        Solution s = new Solution();
        System.out.println(s.searchInsert(nums, 5));

    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target){
                    return i;
                }
            }
            return nums.length;
        }
    }
}


