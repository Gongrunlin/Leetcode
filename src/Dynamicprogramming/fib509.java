package Dynamicprogramming;

public class fib509 {
//    public int fib(int n) {
//        if (n == 1) return 1;
//        if (n == 0) return 0;
//        return fib(n - 1) + fib(n - 2);
//    }
public static void main(String[] args) {
    fib(4);
}

    public static int fib(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        int[] result = new int[n+1];
        result[1] = 1;
        result[0] = 0;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i-1]+result[i-2];
        }
        for (int i : result) {
            System.out.println(i);
        }
        return result[n];
    }
}
