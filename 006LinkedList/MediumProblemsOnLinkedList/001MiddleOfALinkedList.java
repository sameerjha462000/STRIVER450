// problem -- https://leetcode.com/problems/middle-of-the-linked-list/
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null ||  head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // classic slow fast approach
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}



// ROUGH WORK




