/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            boolean found = false;
            while (next != null) {
                if (next.val > curr.val) {
                    res.add(next.val);
                    found = true;
                    break;
                }
                next = next.next;
            }
            if (!found) {
                res.add(0);
            }
            curr = curr.next;
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}