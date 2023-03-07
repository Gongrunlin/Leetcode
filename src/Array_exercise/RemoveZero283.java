package Array_exercise;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//        请注意 ，必须在不复制数组的情况下原地对数组进行操作。

public class RemoveZero283 {
    public static void main(String[] args) {
        int[] nums = {0,0,12,4,0,5,0};
        Solution s = new Solution();
        s.moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


    static class Solution {
        public void moveZeroes(int[] nums) {
            int slow = 0;
            for (int fast = 0; fast < nums.length;) {
                if (nums[fast]!=0){
                    nums[slow++] = nums[fast++];
                }
                else fast++;

            }

            for (int i = slow; i < nums.length; i++) {
                nums[i]=0;
            }

        }
    }


    }


//class Solution {
//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                move(nums,i);
//            }
//
//        }
//    }
//
//
//
//    public void move(int[] nums,int star){
//        for (int i = star; i < nums.length-1; i++) {
//            nums[i] = nums[i+1];
//        }
//        nums[nums.length-1] = 0;
//    }
//}
