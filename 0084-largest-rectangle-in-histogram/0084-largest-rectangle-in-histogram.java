import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i <= heights.length; i++) {
            int current;
            if (i == heights.length) {
                current = 0;
            } else {
                current = heights[i];
            }
            while (!stack.isEmpty() && current < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                if (area > max) {
                    max = area;
                }
            }
            stack.push(i);
        }
        return max;
    }
}