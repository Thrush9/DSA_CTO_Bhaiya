package org.training.dsa.arrays;

public class BuyAndSellStock2 {

    public static void main(String[] args) {
        maxProfitForMultipleDays();
    }

    public static void maxProfitForMultipleDays() {
        int[] prices = {7,1,5,3,2,1};
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1])
                totalProfit += (prices[i] - prices[i-1]);

        }
        System.out.println(totalProfit);
    }
}
