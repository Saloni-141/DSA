
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        // ListNode temp = head;
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(temp != null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // int i = 0, j = arr.size()-1;
        // while(i <= j){
        //     if(!arr.get(i).equals(arr.get(j))) return false;
        //     i++;
        //     j--;
        // }
        // return true;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
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
        while( t2 != null){
            if(t1.val != t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}