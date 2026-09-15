class Solution {
    private int[] maxHeap;
    private int[] minHeap;
    private int maxLen = 0;
    private int minLen = 0;
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] res = new double[n - k + 1];
        maxHeap = new int[n];
        minHeap = new int[n];
        int[] heapId = new int[n];
        for (int i = 0; i < k; i++) {
            pushMax(i, nums);
            heapId[i] = 1;
        }
        for (int i = 0; i < k / 2; i++) {
            int idx = popMax(nums);
            pushMin(idx, nums);
            heapId[idx] = 2;
        }
        res[0] = (k % 2 == 1) ? nums[maxHeap[0]] : ((double) nums[maxHeap[0]] + nums[minHeap[0]]) / 2.0;
        int idxRes = 1;
        for (int i = k; i < n; i++) {
            int outIdx = i - k;
            int balance = 0;
            if (heapId[outIdx] == 1) balance--;
            else balance++;
            while (maxLen > 0 && maxHeap[0] <= outIdx) popMax(nums);
            while (minLen > 0 && minHeap[0] <= outIdx) popMin(nums);
            if (maxLen == 0 || nums[i] <= nums[maxHeap[0]]) {
                pushMax(i, nums);
                heapId[i] = 1;
                balance++;
            } else {
                pushMin(i, nums);
                heapId[i] = 2;
                balance--;
            }
            if (balance < 0) {
                while (minLen > 0 && minHeap[0] <= outIdx) popMin(nums);
                int moveIdx = popMin(nums);
                pushMax(moveIdx, nums);
                heapId[moveIdx] = 1;
            } else if (balance > 0) {
                while (maxLen > 0 && maxHeap[0] <= outIdx) popMax(nums);
                int moveIdx = popMax(nums);
                pushMin(moveIdx, nums);
                heapId[moveIdx] = 2;
            }
            while (maxLen > 0 && maxHeap[0] <= outIdx) popMax(nums);
            while (minLen > 0 && minHeap[0] <= outIdx) popMin(nums);
            res[idxRes++] = (k % 2 == 1) ? nums[maxHeap[0]] : ((double) nums[maxHeap[0]] + nums[minHeap[0]]) / 2.0;
        }
        return res;
    }
    private void pushMax(int idx, int[] nums) {
        maxHeap[maxLen] = idx;
        int curr = maxLen;
        maxLen++;
        while (curr > 0) {
            int p = (curr - 1) >> 1;
            if (nums[maxHeap[curr]] > nums[maxHeap[p]] || 
               (nums[maxHeap[curr]] == nums[maxHeap[p]] && maxHeap[curr] > maxHeap[p])) {
                int t = maxHeap[curr];
                maxHeap[curr] = maxHeap[p];
                maxHeap[p] = t;
                curr = p;
            } else break;
        }
    }
    private int popMax(int[] nums) {
        int res = maxHeap[0];
        maxLen--;
        if (maxLen > 0) {
            maxHeap[0] = maxHeap[maxLen];
            int curr = 0;
            while (true) {
                int left = (curr << 1) + 1;
                int right = left + 1;
                if (left >= maxLen) break;
                int best = left;
                if (right < maxLen) {
                    if (nums[maxHeap[right]] > nums[maxHeap[left]] || 
                       (nums[maxHeap[right]] == nums[maxHeap[left]] && maxHeap[right] > maxHeap[left])) {
                        best = right;
                    }
                }
                if (nums[maxHeap[best]] > nums[maxHeap[curr]] || 
                   (nums[maxHeap[best]] == nums[maxHeap[curr]] && maxHeap[best] > maxHeap[curr])) {
                    int t = maxHeap[curr];
                    maxHeap[curr] = maxHeap[best];
                    maxHeap[best] = t;
                    curr = best;
                } else break;
            }
        }
        return res;
    }
    private void pushMin(int idx, int[] nums) {
        minHeap[minLen] = idx;
        int curr = minLen;
        minLen++;
        while (curr > 0) {
            int p = (curr - 1) >> 1;
            if (nums[minHeap[curr]] < nums[minHeap[p]] || 
               (nums[minHeap[curr]] == nums[minHeap[p]] && minHeap[curr] > minHeap[p])) {
                int t = minHeap[curr];
                minHeap[curr] = minHeap[p];
                minHeap[p] = t;
                curr = p;
            } else break;
        }
    }
    private int popMin(int[] nums) {
        int res = minHeap[0];
        minLen--;
        if (minLen > 0) {
            minHeap[0] = minHeap[minLen];
            int curr = 0;
            while (true) {
                int left = (curr << 1) + 1;
                int right = left + 1;
                if (left >= minLen) break;
                int best = left;
                if (right < minLen) {
                    if (nums[minHeap[right]] < nums[minHeap[left]] || 
                       (nums[minHeap[right]] == nums[minHeap[left]] && minHeap[right] > minHeap[left])) {
                        best = right;
                    }
                }
                if (nums[minHeap[best]] < nums[minHeap[curr]] || 
                   (nums[minHeap[best]] == nums[minHeap[curr]] && minHeap[best] < minHeap[curr])) {
                    int t = minHeap[curr];
                    minHeap[curr] = minHeap[best];
                    minHeap[best] = t;
                    curr = best;
                } else break;
            }
        }
        return res;
    }
}