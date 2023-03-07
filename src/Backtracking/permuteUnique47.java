package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permuteUnique47 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        BackTracking(nums);
        return result;
    }
    public void BackTracking(int[] nums){
        if (list.size() == nums.length){//判断是否存在重复
            boolean a = true;
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).size() == list.size()){
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) != result.get(i).get(j)){
                            break;
                        }
                        if (j == list.size() - 1){
                            a = false;
                        }
                    }
                }
            }
            if (a){
                result.add(new ArrayList<>(list));
                return;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            BackTracking(nums);
            list.removeLast();
            used[i] = false;
        }
    }


}
