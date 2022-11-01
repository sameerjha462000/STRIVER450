// problem -- https://leetcode.com/problems/middle-of-the-linked-list/
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        
        if(head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.next;
    }
}



// ROUGH WORK








