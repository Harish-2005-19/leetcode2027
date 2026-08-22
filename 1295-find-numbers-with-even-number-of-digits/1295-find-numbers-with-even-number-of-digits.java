class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int numc=0;
            int a=nums[i];
            while(a!=0){
                int dig=a%10;
                numc++;
                a=a/10;
            }
            if(numc%2==0)
            c++;
        }
        return c;
    }
}