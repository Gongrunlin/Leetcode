package Greed;

public class canCompleteCircuit134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int result = -1;
        for (int i = 0; i < gas.length; i++) {
            int g = 0;//初始油量
            int k = 0;//记录步数
            for (int j = i;k<=gas.length; ){
                if (g + gas[j%gas.length] - cost[j%gas.length] < 0 ){
                    break;
                }else {
                    g = g+gas[j%gas.length]-cost[j%gas.length];
                    k++;
                    j=(j+1)%gas.length;
                }
                if (k == gas.length){
                    result = i;
                }
            }
        }
        return result;
    }
}
