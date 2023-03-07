package Array_exercise;

public class mySqtr69 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(4));
//        System.out.println(Math.pow(2,31));


    }



    static class Solution {
        public int mySqrt(int x) {
            int a=0;
            for (int i = 0; i < x; i++) {
                if (((i*i)<=x)&&((i+1)*(i+1)>x)){
                    a = i;
                }
            }
            return a;
        }
    }


}



