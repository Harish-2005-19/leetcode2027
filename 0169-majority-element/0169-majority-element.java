class Solution {
    public int majorityElement(int[] nums) {
        int t = 0;
        int c = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (c == 0) 
                t = nums[i]; 
            if (nums[i] == t) 
                c++;
            else 
                c--;
        }
        return t; 
    }
}