package Hash_Exercise;

import java.util.ArrayList;
import java.util.List;

public class findAnagrams438 {
    public static void main(String[] args) {
        String s = "012345";
        String sb = s.substring(0,2);
        System.out.println(sb);


    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length()<p.length()) return list;
        int len = p.length();
        for (int i = 0; i <= s.length() - p.length() ; i++) {
                String sb = s.substring(i,i+len);
                if (isAnagram(sb,p)){
                    list.add(i);
                }
        }
        return list;
    }
    public boolean isAnagram(String s, String t) {

        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
