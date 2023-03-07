package Greed;

import java.util.Arrays;
import java.util.LinkedList;

public class merge56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        LinkedList<int[]> que = new LinkedList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            int[] a = {intervals[i][0],intervals[i][1]};//先添加进来
            que.add(a);
            if (intervals[i][0] > max){
                min = intervals[i][0];
                max = intervals[i][1];
                continue;
            }
            if (intervals[i][1]>=max&&intervals[i][0] <= max){
                que.removeLast();
                max = intervals[i][1];
                int[] q = {min,max};
                que.set(que.size()-1,q);
                continue;
            }
            que.removeLast();

        }
        return que.toArray(new int[que.size()][]);
    }
}
