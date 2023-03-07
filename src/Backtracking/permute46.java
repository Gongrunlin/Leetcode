package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permute46 {
    private static List<List<Integer>> result = new ArrayList<>();
    private static LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        huisu(nums,0);
        return result;
    }

    public static void huisu(int[] nums,int p){
        if (list.size() == nums.length){
            result.add(new ArrayList<>());
            return;
        }
        //除了子集都会遍历
        list.add(nums[p]);
        for (int i = 0; i < nums.length; i++) {
            if (i == p){
                continue;
            }
            list.add(nums[i]);

            huisu(nums,p);
            list.removeLast();
        }


    }

}
