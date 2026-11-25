
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        // ListNode temp = head;
        // ArrayList<ListNode> arr = new ArrayList<>();
        // while(temp != null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }
        // int n = arr.size();
        // for(int i=n-1; i>=1; i--){
        //     arr.get(i).next = arr.get(i-1);
        // }
        // arr.get(0).next = null;
        // return arr.get(n-1);

        ListNode curr = head;
        ListNode prev = null;
        ListNode frd = prev;
        while(curr != null){
            frd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frd;
        }
        return prev;
    }
}