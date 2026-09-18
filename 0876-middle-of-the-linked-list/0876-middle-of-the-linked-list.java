
class Solution {
    public ListNode middleNode(ListNode head) {
        // int length = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     length++;
        // }
        // temp = head;
        // for(int i=1; i<=length/2; i++){
        //     temp = temp.next;
        // }
        // return temp;

        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null) return head;
        while(fast != null && fast.next != null){
           
            slow = slow.next;
             fast = fast.next.next;
        }
        return slow;
    }
}