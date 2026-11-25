
class Solution {
    public int pairSum(ListNode head) {
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
        int sum = 0;
        int currsum = 0;
        while(t1 != null){
            currsum = t1.val + t2.val;
            if(sum < currsum){
                sum = currsum;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return sum;
    }
}