class Solution {
    // 用贪心算法 
    public int maxProfit(int[] prices) {
        int res = 0;
        int length = prices.length;

        if(length< 2) {
            return res;
        }

        for(int i = 1; i < length; i++) {
            res += Math.max(prices[i]-prices[i-1],0);
        }

        return res;
    }
}