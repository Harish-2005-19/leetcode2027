class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);

        int p[]=new int[n];
        p[0]=nums[0];
        p[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            p[i]=Math.max(p[i-1],p[i-2]+nums[i]);
        }
        return p[n-1];
    }
}