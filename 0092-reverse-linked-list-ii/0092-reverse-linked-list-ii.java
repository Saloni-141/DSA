
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d = new ListNode(-1);
        d.next = head;
        ListNode a = d;
        for(int i = 1; i < left; i++){
            a = a.next;
        }
       ListNode c = a.next;
       ListNode b = c;
        for(int i = left; i < right; i++){
            b = b.next;
        }
        ListNode after = b.next;
         b.next = null;

        //rotate
        ListNode prev = null;
        ListNode curr = c;
         ListNode frd = null;
         while(curr != null){
            frd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frd;
         }
         a.next = prev;
        c.next = after;
         return d.next;
    }
}