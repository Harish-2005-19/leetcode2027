class Solution {
    public int trap(int[] height) {
        int result = 0;
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        
        while (l < r){
            if (leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                result += (leftMax - height[l]);
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                result += (rightMax - height[r]);
            }
        }
        System.gc();
        return result;
    }
}