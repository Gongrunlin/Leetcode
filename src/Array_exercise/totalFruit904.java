package Array_exercise;

public class totalFruit904 {
    public static void main(String[] args) {
        int[] fruits = {1, 1, 1, 1, 8, 3, 3, 3};
        totalFruit(fruits);
    }

    public static int totalFruit(int[] fruits) {
        int[] result = new int[fruits.length];
        for (int i = 0; i < fruits.length; i++) {
            int sum = 0;//记录移动的步幅

            int[] leibie =new int[2];
            leibie[0] = fruits[i];//记录当前遍历到的种类
            leibie[1] = -1;

            //find the longest
            for (int j = i; j < fruits.length; j++){

                //有新的种类进来了
                if (leibie[1]==-1&&leibie[0]!=fruits[j]){
                    leibie[1] = fruits[j];
                }
                if (leibie[1]!=-1&&leibie[0]!=fruits[j]&&leibie[1]!=fruits[j]){
                    break;
                }
                if (leibie[0]==fruits[j]||leibie[1]==fruits[j]){
                    sum++;
                    result[i] = sum;
                }
            }
        }
        int max = result[0];
        for (int i = 1; i < result.length; i++) {
            if (max<result[i]){
                max = result[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return max;
    }

}
