package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class findSubsequences491 {
    List<List<Integer>> result = new ArrayList<>();

    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        find_hander(nums,0);
        List<List<Integer>> result_last = new ArrayList<>();

        for (List<Integer> list1 : result) {
            boolean a = true;
            if (Crease( list1) && list1.size() > 1){
                for (int i = 0; i < result.size(); i++) {
                    if (result.get(i).size() == list1.size()){
                        for (int j = 0; j < list1.size(); j++) {
                            if (list1.get(j) != result.get(i).get(j)){
                                break;
                            }
                            if (j == list1.size() - 1){
                                a = false;
                            }
                        }
                    }
                }
            }
            if (a){
                result_last.add(list1);
            }
        }

        return result_last;

    }

    public  void find_hander(int[] nums,int start){
        result.add(new ArrayList<>(list));

        if (start > nums.length - 1){
            return;
        }
        for (int i = start;i < nums.length ;i++){
                list.add(nums[i]);
                find_hander(nums,i+1);
                list.removeLast();
        }

    }

    public static boolean Crease(List l){
        boolean m = true;
        if (l.size() == 0) return true;
        if (l.size() == 1) return true;
        if (l.size() == 2){
            if ((int)l.get(1) - (int)l.get(0) >0){
                return true;
            }
            else return false;
        }
        for (int i = 1; i < l.size(); i++) {
            int a = (int) l.get(i);
            int b = (int) l.get(i-1);
            if ((a - b)<=0){
                m = false;
            }
        }
        return m;
    }

}
