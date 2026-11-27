class Solution {
    public ListNode  reverse(ListNode l){
        ListNode prev = null;
        ListNode curr = l;
        ListNode frd = null;
        while(curr != null){
            frd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return reverse(dummy.next);
    }
}