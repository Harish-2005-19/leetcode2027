public class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (int n : nums) { 
            if ((max1 != null && n == max1) || 
                (max2 != null && n == max2) || 
                (max3 != null && n == max3)) continue;

            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return (max3 == null) ? max1 : max3;
    }
}