package StackAndQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class maxSlidingWindow239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3};
        int[] a = maxSlidingWindow(nums,2);
        for (int i : a) {
            System.out.println(i);
        }
    }
    /**
     * 用一个单调队列来存储对应的下标，每当窗口滑动的时候，直接取队列的头部指针对应的值放入结果集即可
     * 单调队列类似 （tail -->） 3 --> 2 --> 1 --> 0 (--> head) (右边为头结点，元素存的是下标)
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int m = 0;
        for(int i = 0; i < n; i++) {
            //下标位置不对
            while (!list.isEmpty() && list.getFirst() < i - k +1){
                list.removeFirst();
            }
            //大小不合适
            while (!list.isEmpty() && nums[i] > nums[list.getLast()]){
                list.removeLast();
            }
            list.addLast(i);
            if (i >= k -1){
                res[m++] = nums[list.getFirst()];
            }
        }
        return res;
    }
}
