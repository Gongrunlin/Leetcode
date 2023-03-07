package Hash_Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class isHappy202 {
    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int a = n;
        while (true){
            if (set.add(a)){
                if (set.contains(1)){
                    return true;
                }
                a = result(a);
            }else{
                return false;
            }
        }
    }
    public static int result(int x){//计算快乐数
        List<Integer> list = new ArrayList<>();
        if (x == 0) return 0;
        while (x!=0){
            list.add(x % 10);
            x = x / 10;
        }
        int sum = 0;
        for (Integer integer : list) {
           sum+=(integer*integer);
        }
        return sum;
    }


}
