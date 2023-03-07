package Hash_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);//排个序
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i -1 ] == nums[i]){
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {

                if (j > i + 1 && nums[j - 1] == nums[j]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right){
                    int result = nums[i] + nums[j] + nums[right] + nums[left];
                    if (result > target ) right --;
                    else if (result < target) left ++;
                    else {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[right]);
                        l.add(nums[left]);
                        list.add(l);
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left--;
                        right--;
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
