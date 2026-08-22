class Solution {
    public int dominantIndex(int[] nums) {
        int m=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
                ind=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=ind && nums[i]*2>m)
            return -1;
        }
        return ind;
    }
}