class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int capacity=sum/2;
        int n=nums.length;
        boolean[][] dp=new boolean[n+1][capacity+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int w=1;w<=capacity;w++){
                if(nums[i-1]<=w){
                    dp[i][w]=dp[i-1][w] ||
                             dp[i-1][w-nums[i-1]];
                }
                else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }
        return dp[n][capacity];
    }
}