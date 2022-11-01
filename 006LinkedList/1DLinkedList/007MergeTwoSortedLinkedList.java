// problem -- https://leetcode.com/problems/merge-two-sorted-lists/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        // the concept of dummy node
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        ListNode head = dummy;
        
        ListNode c1 = list1;
        ListNode c2 = list2;
        
        // the concept of merging two sorted arrays
        while(c1 != null && c2 != null){
            if(c1.val <= c2.val){
                head.next = c1;
                c1 = c1.next;
                head = head.next;
            }else{
                head.next = c2;
                c2 = c2.next;
                head = head.next;
            }
        }
        
        while(c1 != null) {
            head.next = c1;
            c1 = c1.next;
            head = head.next;
        }
        while(c2 != null){
            head.next = c2;
            c2 = c2.next;
            head = head.next;
        }
        
        head = dummy.next;
        dummy.next = null;
        dummy = null;
        
        return head;
    }
}




// ROUGH WORK








