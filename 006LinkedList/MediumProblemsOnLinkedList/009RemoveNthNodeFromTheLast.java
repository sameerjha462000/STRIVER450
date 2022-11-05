// problem -- https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null; // In case the size of the linked list is 0
        
        if(head.next == null) return null; // In case the size of the linked list is 1
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(n-- != 0){
            fast = fast.next;
        }
        
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        if(prev == null){
            // delete slow
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            temp = null;
        }else{
            prev.next = slow.next;
            slow.next = null;
            prev = null;
            slow = null;
        }
        
        return head;
        
        
    }
}


// ROUGH WORK







