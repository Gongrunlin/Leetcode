package Backtracking;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class partition131 {
    List<List<String>> lists = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return lists;
    }

    private void backTracking(String s, int start) {
        if (start >= s.length()){
            lists.add(new ArrayList<>(deque));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s,start,i)){
                String str = s.substring(start,i+1);
                deque.addLast(str);
            }else {
                continue;
            }
            backTracking(s,i+1);
            deque.removeLast();
        }
    }


    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
