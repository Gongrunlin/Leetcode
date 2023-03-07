package Greed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class largestSumAfterKNegations1005 {

    public static void main(String[] args) {
        int[] a ={4,2,3};
        largestSumAfterKNegations(a,3);
    }


    public static int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        int sum = 0;
        if (k % 2 == 1) nums[nums.length - 1] = -nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
