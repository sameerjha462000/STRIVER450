// problem -- https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        slow.next = null;
        slow = null;
        prev = null;
        
        return head;
    }
}



// ROUGH WORK






