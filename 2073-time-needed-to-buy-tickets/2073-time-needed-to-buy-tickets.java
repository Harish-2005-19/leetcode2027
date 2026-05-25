import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<int[]>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(new int[]{i, tickets[i]});
        }
        int time = 0;
        while (!q.isEmpty()) {
            int[] person = q.poll();
            int index = person[0];
            int rem = person[1];
            rem--;
            time++;
            if (rem == 0) {

                if (index == k) {
                    return time;
                }
            } else {

                q.offer(new int[]{index, rem});
            }
        }

        return time;
    }
}