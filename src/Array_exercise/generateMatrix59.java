package Array_exercise;

public class generateMatrix59 {
    public static void main(String[] args) {
        int[][] a = generateMatrix(1);
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        //  1、初始化边界
        int top = 0;
        int right = n-1;
        int left = 0;
        int buttom = n-1;
        //2、逆序方法：向右 、向下、向左、向上
        int num = 1;
        while (num <= n * n){
            for (int i = left; i <= right; i++,num++) {
                result[top][i] = num;
            }
            top++;
            for (int i = top; i <= buttom; i++,num++) {
                result[i][right] = num;
            }
            right--;
            for (int i = right; i >= left ; i--,num++) {
                result[buttom][i] = num;
            }
            buttom--;
            for (int i = buttom; i >= top ; i--,num++) {
                result[i][left] = num;
            }
            left++;
        }


        return result;
    }
}
