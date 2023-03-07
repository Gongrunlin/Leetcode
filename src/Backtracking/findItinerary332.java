package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findItinerary332 {
    private static List<String> result = new ArrayList<>();
    private static boolean[] used;
    public static List<String> findItinerary(List<List<String>> tickets) {
        used = new boolean[tickets.size()];
        for (int i = 0; i < used.length; i++) {
            used[i] = true;
        }
        backtracking(tickets,"JFK");
        return result;
    }

    public static void backtracking(List<List<String>> tickets,String from){

        String next = "";
        int k = 0;
        for (int i = 0; i < tickets.size(); i++) {//第一次找合适的出发点
            if (tickets.get(i).get(0).equals(from) && used[i] == true){
                next = tickets.get(i).get(1);
                k = i;
                break;
            }
        }

        if (next.equals("")){
            backtracking(tickets,from);
        }

        //出发点
        for (int i = 0; i < tickets.size(); i++) {//找最小的那个位置的出发点
            if (tickets.get(i).get(0).equals(from) && used[i] == true){
                if (next.compareTo(tickets.get(i).get(1)) > 0){
                    next = tickets.get(i).get(1);
                    k = i;
                }
            }
        }
        result.add(from);
        used[k] = false;//用过了
        backtracking(tickets,next);
        if (result.size() == tickets.size()+1){
            return;
        }
    }


    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("JFK");
        list1.add("KUL");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"JFK","NRT");
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"NTR","JFK");
        List<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"LHR","SFO");
        tickets.add(list1);
        tickets.add(list2);
        tickets.add(list3);

        findItinerary(tickets);



    }



}



