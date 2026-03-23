class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode c1 = list1, c2 = list2;
        while (c1 != null && c2 != null) {
            if (c1.val <= c2.val) {
                temp.next = c1;
                c1 = c1.next;
            } 
            else {
                temp.next = c2;
                c2 = c2.next;
            }
            temp = temp.next;
        }
        if (c1 != null) {
            temp.next = c1;
        }
        else {
            temp.next = c2;
        }
        return dummy.next;
    }
}