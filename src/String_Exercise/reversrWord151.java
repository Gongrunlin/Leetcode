package String_Exercise;

import java.util.*;

public class reversrWord151 {

    public static void main(String[] args) {
        String a = "hello my  friend";
        System.out.println(reverseWords(a));

    }
    public static String reverseWords(String s) {
        LinkedList<String> Scentences = new LinkedList<>();
        char[] a = s.toCharArray();
        ArrayList<Character> word = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == ' ' || i == s.length() - 1){
                if(i == s.length() - 1 && a[i] != ' ') word.add(a[i]);
                if (!word.isEmpty()){
                    StringBuilder sb = new StringBuilder();
                    for (int i1 = 0; i1 < word.size(); i1++) {
                        sb.append(word.get(i1));
                    }
                    for (int i1 = word.size()-1; i1 >= 0; i1--) {
                        word.remove(i1);
                    }
                    if (sb != null) Scentences.addFirst(sb.toString());
                }
            }
            else {
                word.add(a[i]);
            }
        }
        String result = "";
        for (int i = 0; i < Scentences.size(); i++) {
            if (i!=Scentences.size()-1){
                result  = result + Scentences.get(i).toString() + " ";
            }
            else
                result = result + Scentences.get(i);
        }
        return result;
    }
}
//class Solution {
//    public String reverseWords(String s) {
//        // 除去开头和末尾的空白字符
//        s = s.trim();
//        // 正则匹配连续的空白字符作为分隔符分割
//        List<String> wordList = Arrays.asList(s.split("\\s+"));
//        Collections.reverse(wordList);
//        return String.join(" ", wordList);
//    }
//}
