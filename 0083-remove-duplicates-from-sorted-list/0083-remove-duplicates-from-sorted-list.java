
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         if(head == null) return null;
        ListNode temp = head;
        ListNode t = head;
        while( t != null ){
            if(temp.val == t.val){
                 t = t.next;
            }
            else{temp.next = t; 
            temp = t; 
            t = t.next;} 
        } 
         temp.next = null; 
        return head;
    }
}