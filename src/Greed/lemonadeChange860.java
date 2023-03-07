package Greed;

import java.util.HashMap;

public class lemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5){//顾客给的是5
                if (map.containsKey(5)) map.put(5,1+map.get(5));
                else map.put(5,1);
                continue;
            }
            if (bills[i] == 10){//给的是10
                if (map.containsKey(5) && map.get(5) >= 1){//可以找零
                    map.put(5,map.get(5)-1);
                    if (map.containsKey(10)) map.put(10,map.get(10)+1);
                    else map.put(10,1);
                }//不能找零
                else return false;
                continue;
            }
            if (bills[i] == 20){
                //先用10+5找
                if (map.containsKey(5) &&map.containsKey(10) &&map.get(5)>=1&&map.get(10)>=1){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                    if (map.containsKey(20)) map.put(20,map.get(20)+1);
                    else map.put(20,1);
                    continue;
                }
                if (map.containsKey(5) &&map.get(5)>=3){
                    map.put(5,map.get(5) - 3);
                    if (map.containsKey(20)) map.put(20,map.get(20)+1);
                    else map.put(20,1);
                    continue;
                }
                else return false;
            }
        }
        return true;
    }
}
