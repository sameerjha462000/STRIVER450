// problem -- https://leetcode.com/problems/rotate-list/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        // reduce k
        int size = size(head);
        k = k % size;
        
        if(k == 0) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(k-- != 0){
            fast = fast.next;
        }
        ListNode prev = null;
        
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        // Make two linked list
        ListNode one = head;
        ListNode two = slow;
        prev.next = null;
        
        // reverse the two linked list
        one = reverse(one);
        two = reverse(two);
        
        ListNode curr = one;
        while(curr != null && curr.next != null) curr = curr.next;
        
        if(curr != null) curr.next = two;
        
        one = reverse(one);
        
        return one;
        
    }
    
    private static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    private static int size(ListNode head){
        if(head == null) return 0;
        if(head.next == null) return 1;
        
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        
        return count;
    }
}


// ROUGH WORK





