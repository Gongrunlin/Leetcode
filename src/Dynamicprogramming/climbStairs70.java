package Dynamicprogramming;

public class climbStairs70 {
    public int climbStairs(int n) {
        if (n<3){
            return n;
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i-1]+result[i-2];
        }

        for (int i : result) {
            System.out.println(i);
        }
        return result[n];
    }
}
