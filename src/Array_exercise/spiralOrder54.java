package Array_exercise;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder54 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{2,5,6}};
        System.out.println(a.length);
        System.out.println(a[0].length);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int hang = matrix.length;
        int lie = matrix[0].length;

        int top = 0;
        int left = 0;
        int right = lie-1;
        int bottom = hang-1;
        int k = 1;
        while (k<=hang*lie){
            for (int i = left; i <= right&&k<=hang*lie ; i++) {
                list.add(matrix[top][i]);
                k++;
            }
            top++;
            for (int i = top; i <= bottom&&k<=hang*lie; i++) {
                list.add(matrix[i][right]);
                k++;
            }
            right--;
            for (int i = right; i >= left&&k<=hang*lie ; i--) {
                list.add(matrix[bottom][i]);
                k++;
            }
            bottom--;
            for (int i = bottom; i >= top&&k<=hang*lie ; i--) {
                list.add(matrix[i][left]);
                k++;
            }
            left--;
        }
        return list;
    }
}
