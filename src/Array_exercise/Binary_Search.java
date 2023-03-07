package Array_exercise;


//704二分查找
class Binay_Search {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(s.search(nums, 5));
    }
}


class Solution {
    public int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }
}