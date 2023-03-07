package Greed;

import java.util.Arrays;

public class findContentChildren455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int a = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        //链表
        for (int i = 0,j = 0;i < g.length && j < s.length;){
            if (g[i] > s[j]){
                j++;
            }else if (g[i] <= s[j]){
                i++;
                j++;
                a++;
            }
        }
        return a;
    }
}
