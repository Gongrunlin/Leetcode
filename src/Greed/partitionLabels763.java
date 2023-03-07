package Greed;

import java.util.LinkedList;
import java.util.List;

public class partitionLabels763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new LinkedList<>();
        //统计最远的
        int[] Longest = new int[26];
        char[] st = s.toCharArray();
        for (int i = 0; i < st.length; i++) {
            Longest[st[i] - 'a'] = i;
        }
        int start = -1;
        int max = 0;//记录边界
        for (int i = 0; i < st.length; i++) {
            max = Math.max(max,Longest[st[i] - 'a']);

            if (i == max){
                list.add(i-start);
                start = i;
            }
        }
        return list;
    }
}
