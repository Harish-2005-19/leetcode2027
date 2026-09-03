import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] divide) {
        int g = divide[0];
        for (int x : divide) {
            while (x != 0) {
                int temp = g % x;
                g = x;
                x = temp;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > g)
                break;
            if (g % nums[i] == 0)
                return i;
        }
        return -1;
    }
}