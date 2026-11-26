class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        // while(arr.length > 1){
        //     ListNode a = arr[arr.length-1];
        //     // arr[arr.length-1] = null;
        //     ListNode b = arr[arr.length-2];
        //     // arr[arr.length-1] = null;
        //     ListNode c = merge(a , b);
        //     ListNode[] newArr = new ListNode[arr.length - 1];
        //     for(int i = 0; i < arr.length-2; i++){
        //         newArr[i] = arr[i];
        //     }
        //     newArr[newArr.length - 1] = c;
        //     arr = newArr;
        // }
        // return arr[0];

        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists) arr.add(n);
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a , b);
            arr.add(c);
        }
        return arr.get(0);
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