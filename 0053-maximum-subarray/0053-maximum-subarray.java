class Solution {
    public int maxSubArray(int[] nums){
        int r= nums[0];
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(t<0){
                t=0;
            }
            t+=nums[i];
            r= Math.max(r,t);
        }
        return r;
    }
}