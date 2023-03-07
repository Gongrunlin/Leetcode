package Array_exercise;

public class Remove26 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(s.removeDuplicates(nums)+"haha");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }


    static class Solution {
        public int removeDuplicates(int[] nums) {
            int len = 0;
            for (int i = 1; i < nums.length;i++) {
                if (nums[i] == nums[len]){
                }
                else{
                    nums[++len] = nums[i];
                }
            }
            return len+1;
        }
    }



}
