package com.company;

//Say you have an array for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction
//(i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//Note that you cannot sell a stock before you buy one.

//Example 1:
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Not 7-1 = 6, as selling price needs to be larger than buying price.

//Example 2:
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.

public class SellStock {
    public int maxProfit(int[] prices){
        int gap = 0;
        int maximumProfit = 0;

        if(prices.length == 0){
            return maximumProfit;
        }

        int minPrices = prices[0];
        for(int i = 1; i < prices.length; i++){
            gap = prices[i] - minPrices;
            maximumProfit = Math.max(maximumProfit, gap);
            minPrices = Math.min(minPrices, prices[i]);
        }
        return maximumProfit;
    }
}

//hit: at the same time of finding the minimum of prices array, we calculate the gap(difference) between
//minimum and those numbers after(in term of index) the minimum.
//in each loop, we update the maximumProfit and minPrices to get the most accurate data
