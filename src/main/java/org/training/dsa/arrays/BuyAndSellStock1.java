package org.training.dsa.arrays;

public class BuyAndSellStock1 {

    public static void main(String[] args) {
        findBuyAndSellByBruteForce();
        maxProfit();
    }

    private static void findBuyAndSellByBruteForce() {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        System.out.println(maxProfit);
    }

    public static void maxProfit() {
        int[] prices = {7,1,5,3,6,4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        System.out.println(maxProfit);
    }
}
