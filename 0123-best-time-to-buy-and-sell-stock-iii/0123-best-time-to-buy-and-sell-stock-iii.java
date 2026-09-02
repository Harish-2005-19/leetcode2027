class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] suffixProfit = new int[n];
        int maxPrice = prices[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            suffixProfit[i] = maxPrice - prices[i];
        }
        int minPrice = prices[0];
        int prefixProfit = 0;
        int answer = suffixProfit[0];
        for (int i = 1; i < n; i++) {
            prefixProfit = Math.max(prefixProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
            answer = Math.max(answer, prefixProfit + suffixProfit[i]);
        }
        return answer;
    }
}