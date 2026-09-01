class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[j-1]<nums[j])
                    sum+=nums[j];
                else{
                    break;
                }
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}