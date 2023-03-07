package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class subsetsWithDup90 {
    List<List<Integer>> result = new ArrayList<>();

    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets_hander(nums,0);
        return result;
    }
    public void subsets_hander(int[] nums,int start){

        //加入之前先判断是否可以加入
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
        }
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
