class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int x = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
        }
        return -1;
    }
}