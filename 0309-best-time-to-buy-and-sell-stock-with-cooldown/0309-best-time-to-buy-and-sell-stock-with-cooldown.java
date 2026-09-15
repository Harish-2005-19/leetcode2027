class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0, prev_s = 0, buy = Integer.MIN_VALUE, prev_b;
        for (int price : prices) {
            prev_b = buy;
            buy = Math.max(prev_s - price, prev_b);
            prev_s = sell;
            sell = Math.max(prev_b + price, prev_s);
        }
        return sell;
    }
}