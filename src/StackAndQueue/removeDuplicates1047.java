package StackAndQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class removeDuplicates1047 {
    public static void main(String[] args) {
        String a = "2245";
        System.out.println(removeDuplicates(a));
    }
    public static String removeDuplicates(String s) {
        char a[] = s.toCharArray();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < a.length; i++) {
            if (list.isEmpty()||list.getLast()!=a[i]){
                list.addLast(a[i]);
            }
            else {
                list.removeLast();
            }
        }
        String rs ="";
        for (int i = 0; i < list.size(); i++) {
            rs+=list.get(i);
        }
        return rs;
    }
}
