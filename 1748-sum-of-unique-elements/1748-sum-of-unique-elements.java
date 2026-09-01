class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum=0;
        int f[] = new int [256];
        for(int i=0;i<n;i++){
            f[nums[i]]++;
        }
        for(int i=0;i<256;i++){
            if(f[i]==1){
                sum+=(int)i;
            }
        }
        return sum;
    }
}