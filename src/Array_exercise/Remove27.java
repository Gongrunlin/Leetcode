package Array_exercise;


public class Remove27 {
    public static void main(String[] args) {
        int[] nums= {0,1,2,2,3,0,4,2};
        System.out.println("1111");
        Solution s = new Solution();
        s.removeElement(nums,2);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


    }




    static class Solution {
        public int removeElement(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val){
                    nums[index++] = nums[i];
                }
            }
            return index;
        }

    }





}
