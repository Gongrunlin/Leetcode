package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class subsets78 {

    List<List<Integer>> result = new ArrayList<>();

    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsets_hander(nums,0);
        return result;
    }
    public void subsets_hander(int[] nums,int start){
        result.add(new ArrayList<>(list));
        if (start > nums.length - 1){
            return;
        }
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            subsets_hander(nums,i+1);
            list.removeLast();
        }
    }
}
