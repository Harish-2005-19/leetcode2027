class Solution {
    public int longestSubarray(int[] nums) {
        int mlen=0;
        int zero=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            if(nums[we]==0){
                zero++;
            }
            while(zero>1){
                if(nums[ws]==0){
                    zero--;
                }
                ws++;
            }
            mlen=Math.max(mlen,we-ws);
        }
        return mlen;
    }
}