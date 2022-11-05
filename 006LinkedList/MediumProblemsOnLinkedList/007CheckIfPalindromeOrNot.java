// problem -- https://leetcode.com/problems/palindrome-linked-list/
class Solution {
    public boolean isPalindrome(ListNode head) {
        // trivial case
        if(head == null || head.next == null) return true;
        
        // strategy is to find the node next to the mid node
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // In case the list has odd length, then fast would NOT be null and thus slow would be
        // one step behind the head of the second half
        if(fast != null) slow = slow.next;
        
        // Now reverse the part from slow to the last node
        ListNode prev = null;
        ListNode curr = slow;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Now prev is the head of the reversed second half
        // Now we will shall use two pointer approach to compare the values
        // In case the length of the original LL was even, then we can compare each and every value
        // But if the length is odd, then the last node of the first half can not be compared
        
        ListNode c1 = head;
        ListNode c2 = prev;
        
        while(c1 != null && c2 != null){
            if(c1.val != c2.val) return false;
            c1 = c1.next;
            c2 = c2.next;
        }
        
        return true;
    }
}




// ROUGH WORK







