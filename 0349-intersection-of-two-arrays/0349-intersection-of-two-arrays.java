class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    result.add(num1);
                    break;
                }
            }
        }
        int out[] = new int[result.size()];
        int i = 0;
        for (int num : result) {
            out[i++] = num;
        }
        return out;
    }
}