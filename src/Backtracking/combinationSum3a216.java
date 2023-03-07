package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combinationSum3a216 {

    //从1-9中选出k个数字，结果等于n

    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        List<List<Integer>> result2 =  combinationSum3(3,9);
        System.out.println(result2);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        combine(k,1);
        List<List<Integer>> result2 = new ArrayList<>();
        int i=0;
        for (List<Integer> integers : result) {
            int sum = 0;
            for (Integer integer : integers) {
                sum += integer;
            }
            if (sum == n){
                result2.add(result.get(i));
            }
            i++;
        }
            return result2;
    }
    public static void combine(int k,int start){
        if (list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start;i <= 9-(k-list.size()) + 1;i++){
            list.add(i);
            combine(k,i+1);
            list.removeLast();
        }
    }
}
