class Solution {
    public void sortColors(int[] nums) 
    {
       int c=0;
       int d=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
            c++;
        if(nums[i]==1)
            d++;
       }

       for(int i=0;i<c;i++)
            nums[i]=0;
        for(int i=c;i<(c+d);i++)
            nums[i]=1;
        for(int i=(c+d);i<nums.length;i++)
            nums[i]=2;
    }
}