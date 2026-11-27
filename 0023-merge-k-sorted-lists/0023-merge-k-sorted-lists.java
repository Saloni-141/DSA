class Solution {
    // public ListNode mergeKLists(ListNode[] lists){
    //     ArrayList<Integer> arr = new ArrayList<>();//o(knlogkn)
    //     for(ListNode head : lists){
    //         while(head != null){
    //             arr.add(head.val);
    //             head = head.next;
    //         }
    //     }
    //     Collections.sort(arr);

    //     ListNode dummy = new ListNode(-1);
    //     ListNode curr = dummy;
    //     for(int num : arr){
    //         curr.next = new ListNode(num);
    //         curr = curr.next;
    //     }
    //     return dummy.next;
    // }






    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        // ArrayList<ListNode> arr = new ArrayList<>();
        // for(ListNode n : lists) arr.add(n);
        // while(arr.size() > 1){
        //     ListNode a = arr.get(arr.size()-1);
        //     arr.remove(arr.size()-1);
        //     ListNode b = arr.get(arr.size()-1);
        //     arr.remove(arr.size()-1);
        //     ListNode c = merge(a , b);
        //     arr.add(c);
        // }
        // return arr.get(0);
        ListNode result = lists[0];
        for(int i=1; i<lists.length; i++){
            result = merge(result, lists[i]);
        }
        return result;
    }
    public ListNode merge(ListNode h1 , ListNode h2){
        ListNode d = new ListNode(-1);
        ListNode t1 = h1;
        ListNode t2 = h2;
        ListNode t = d;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1 = t1.next;
                
            }
            else{
                t.next = t2;
                t2 = t2.next;
               
            }
            t = t.next;
        }
         if(t1 == null) t.next = t2;
            else t.next = t1;
         return d.next;
    }
}