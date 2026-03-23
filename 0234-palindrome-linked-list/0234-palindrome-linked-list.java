class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode fh = head;
        ListNode sh = slow;
        ListNode curr = sh;
        ListNode prev = null,next=null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        sh = prev;
        while(sh!=null){
            if(fh.val!=sh.val){
                return false;
            } 
            fh=fh.next;
            sh=sh.next;
        }
        return true;
    }
}