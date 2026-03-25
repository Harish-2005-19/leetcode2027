class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int min = prices[0];
        if(prices.length==1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            int c = prices[i];
            if(min>c){
                min=c;
            }
            else{
                int cp = c-min;
                if(cp>p){
                    p=cp;
                }
            }
        }
        return p;
    }
}