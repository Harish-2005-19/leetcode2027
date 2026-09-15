import java.util.*;

class Solution {
    PriorityQueue<Integer> maxHeap =
        new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap =
        new PriorityQueue<>();

    HashMap<Integer, Integer> delayed =
        new HashMap<>();

    int leftSize = 0;
    int rightSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        double[] ans = new double[n - k + 1];

        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }

        for (int i = 0; i < k / 2; i++) {
            minHeap.add(maxHeap.poll());
        }

        leftSize = maxHeap.size();
        rightSize = minHeap.size();

        int index = 0;

        for (int i = k; ; i++) {

            clean(maxHeap);
            clean(minHeap);

            if (k % 2 == 1) {
                ans[index++] = maxHeap.peek();
            } else {
                ans[index++] =
                    ((long) maxHeap.peek() + minHeap.peek()) / 2.0;
            }

            if (i == n)
                break;

            int out = nums[i - k];
            int in = nums[i];

            delayed.put(out, delayed.getOrDefault(out, 0) + 1);

            if (out <= maxHeap.peek()) {
                leftSize--;
            } else {
                rightSize--;
            }

            if (in <= maxHeap.peek()) {
                maxHeap.add(in);
                leftSize++;
            } else {
                minHeap.add(in);
                rightSize++;
            }

            if (leftSize > rightSize + 1) {
                minHeap.add(maxHeap.poll());
                leftSize--;
                rightSize++;
            } else if (leftSize < rightSize) {
                maxHeap.add(minHeap.poll());
                leftSize++;
                rightSize--;
            }
        }

        return ans;
    }

    void clean(PriorityQueue<Integer> heap) {

        while (!heap.isEmpty()) {

            int x = heap.peek();

            if (!delayed.containsKey(x))
                break;

            int count = delayed.get(x);

            if (count == 1)
                delayed.remove(x);
            else
                delayed.put(x, count - 1);

            heap.poll();
        }
    }
}