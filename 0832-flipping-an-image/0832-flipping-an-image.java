class Solution {
    public static void flip(int [] a){
        int i=0;
        int j = a.length-1;
        while(i<j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public int[][] flipAndInvertImage(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            flip(nums[i]);
            for(int j=0;j<nums.length;j++){
                if(nums[i][j]==1){
                    nums[i][j]=0;
                }
                else if(nums[i][j]==0){
                    nums[i][j]=1;
                }
            }
        }
        return nums;
    }
}