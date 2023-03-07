package Greed;

public class maxProfit122 {
    public int maxProfit1(int[] prices) {
        int result = 0;
        int[] profit = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i-1] >= 0){
                result += (prices[i] - prices[i-1]);
            }
        }
        return result;
    }
    public int maxProfit2(int[] prices) {
        int max = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice){
                minprice = prices[i];
            }else if (prices[i] - minprice > max){
                max = prices[i] - minprice;
            }
        }
        return max;
    }
}
