package Hash_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//排个序
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return list;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int[] result = new int[3];
                List<Integer> l = new ArrayList<>();
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right--;
                }else if (sum < 0){
                    left++;
                }else {
                    l.add(nums[i]);
                    l.add(nums[right]);
                    l.add(nums[left]);
                    list.add(l);
                    while(right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return list;
    }
}
