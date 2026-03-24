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

    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = head;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        ListNode KthNode = head;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        ListNode nxtNode = head;

        while( KthNode != null){
            int i=0;
            KthNode = temp;

            while(KthNode != null && i<k-1){
                KthNode = KthNode.next;
                i++;
            }

            if(KthNode == null){
                prev.next = temp;
            }
            else{
                nxtNode = KthNode.next;
                KthNode.next = null;
                prev.next = reverseList(temp);
                prev = temp;
                temp = nxtNode;
            }
        }

        return dummy.next;

    }
}