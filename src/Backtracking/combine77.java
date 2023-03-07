package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combine77 {

    //在1-n中选取k个数，列出所有排列组合
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        //回溯
        combine2(n,k,1);
        return result;

    }
    public void combine2(int n,int k,int start){
        if (list.size() == k){
            result.add(new ArrayList<>(list));
            return ;
        }
        for (int i = start; i <= n-(k-list.size()) + 1; i++) {
            list.add(i);
            combine2(n,k,i+1);
            list.removeLast();
        }
    }
}
