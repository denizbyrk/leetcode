package P0121BestTimeToBuyAndSellStock;

public class Solution {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int bestTime = 0;

        for (int i = 0; i < prices.length; i++) {
        	
            if (prices[i] < minPrice) {
            	
                minPrice = prices[i];
                
            } else if (prices[i] - minPrice > bestTime) {
            	
            	bestTime = prices[i] - minPrice;
            }
        }

        return bestTime;
    }
    
    public static void main(String[] args) {
    	
    	int[] input = {7,1,5,3,6,4};
    	
    	int output = Solution.maxProfit(input);
    	
    	System.out.println(output);
    }
}