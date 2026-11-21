
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        int val1 = 0;
        int val2 = 0;
        for(int i=1; i<k; i++){
            fast = fast.next;
        }
        val1 = fast.val;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        val2 = slow.val;
        fast = head;
        slow = head;
        for(int i=1; i<k; i++){
             fast = fast.next;
           
        }
         fast.val = val2;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.val = val1;
        return head; 
    }
}