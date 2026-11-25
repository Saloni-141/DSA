
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int i = 0, j = arr.size()-1;
        while(i <= j){
            if(!arr.get(i).equals(arr.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}