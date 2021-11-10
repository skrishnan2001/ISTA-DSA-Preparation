package Week02_Arrays;

//TC: O(n) | SC: O(1)
public class Q5_BestTimeToSellStock1 {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = prices[0];
        int maxProfit = 0;
        for(int currentPrice : prices)
        {
            minPriceSoFar = Math.min(minPriceSoFar, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - minPriceSoFar);
        }
        return maxProfit;
    }
}
