package Nov-19-2024 .Best  Time to buy and sell the stock;

class Solution {
    int charge ; 
    public int maxProfit(int[] prices, int fee) {
        
        
         charge = fee ; 
            int[][] dp = new int[prices.length][2];


        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

   
        return maxProfitHelper(0, 0, prices, dp);
    }

    public int maxProfitHelper(int pos, int holdTheStock, int[] prices, int[][] dp) {
   
        if (pos == prices.length) return 0;


        if (dp[pos][holdTheStock] != -1) return dp[pos][holdTheStock];


        int profit;

        if (holdTheStock == 0) {
           
            int buy = -prices[pos] + maxProfitHelper(pos + 1, 1, prices, dp);
           
            int stay = maxProfitHelper(pos + 1, 0, prices, dp);

          
            profit = Math.max(buy, stay);

        } else {
     
            int sell = (prices[pos] + maxProfitHelper(pos + 1, 0, prices, dp) ) - charge;
          
            int stay = maxProfitHelper(pos + 1, 1, prices, dp);

            profit = Math.max(sell, stay) ;
        }

     
        dp[pos][holdTheStock] = profit;

        return profit;
    }
        
}
