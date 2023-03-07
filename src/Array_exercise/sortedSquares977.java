package Array_exercise;

public class sortedSquares977 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {-1,0,-5,9,-12};
        int[] num_new = s.sortedSquares(nums);

        for (int i = 0; i < num_new.length; i++) {
            System.out.println(num_new[i]);
        }

    }

    static class Solution1 {
        public int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]*nums[i];
            }
            int temp;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = nums.length - 1; j > i; j--){
                    if (nums[j-1] > nums[j]){
                        temp = nums[j-1];
                        nums[j-1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        return nums;
        }
    }


}
