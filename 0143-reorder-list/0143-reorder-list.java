class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode h2 = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = h2;
        ListNode frd = null;
        while(curr != null){
            frd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frd;
        }
        ListNode t1 = head;
        ListNode t2 = prev;
        while(t2 != null){
            ListNode a = t1.next;
            ListNode b = t2.next;
            t1.next = t2;
            t2.next = a;

            t1 = a;
            t2 = b;
           
        }
        
        
    }
}