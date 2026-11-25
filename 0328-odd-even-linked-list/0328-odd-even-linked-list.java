
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        // ListNode odd = head;
        // ListNode even = head.next;
        // ListNode evenhead = even;
        // while(even != null && even.next != null){
        //     odd.next = odd.next.next;
        //     odd = odd.next;
        //      even.next = even.next.next;
        //     even = even.next;
        // }
        // odd.next = evenhead;
        // return head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode t = head;
        while(t != null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if(t != null) t = t.next;
            t2 = t2.next;
        }
        t1.next = d2.next;
        return d1.next;
    }
}