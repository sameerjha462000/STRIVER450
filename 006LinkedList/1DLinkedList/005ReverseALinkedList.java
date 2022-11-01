// problem -- https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode rres = reverseList(head.next);
        ListNode temp = rres;
        while(rres.next != null) rres = rres.next;
        rres.next = head;
        
        head.next = null;
        
        return temp;
    }
}


// ROUGH WORK




