
class Solution {
    public ListNode sortList(ListNode head) {
        if( head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        head = sortList(head);
        a = sortList(a);
        return merge(head, a);
    }
    public ListNode merge(ListNode h1, ListNode h2){
        ListNode t1 = h1;
        ListNode t2 = h2;
        ListNode d = new ListNode(-1);
        ListNode t = d;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t = t.next;
                t1 = t1.next;
            }
            else{
                 t.next = t2;
                t = t.next;
                t2 = t2.next;
            }
        }
        if(t1 == null) t.next = t2;
        else t.next = t1;
        return d.next;

    }
}