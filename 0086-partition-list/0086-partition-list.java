
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode t = head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        while(t != null){
            if(t.val < x){
                t1.next = t;
                t1 = t;
                t = t.next;   
            }
            else{
                t2.next = t;
                t2 = t;
                t = t.next;
            }
        }
        t2.next = null;
        t1.next = d2.next;
        return d1.next;
    }
}