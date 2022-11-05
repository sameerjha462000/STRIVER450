// problem -- https://leetcode.com/problems/sort-list/
class Solution {
    public ListNode sortList(ListNode head) {
        // apply merge sort
        if(head == null || head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow is at the mid of the linked list
        if(prev != null) prev.next = null; // detach the first part of the LL from the second part
        
        ListNode partOne = sortList(head);
        ListNode partTwo = sortList(slow);
        
        ListNode ans = merge(partOne, partTwo);
        
        return ans;
    }
    
    private static ListNode merge(ListNode one, ListNode two){
        if(one == null) return two;
        if(two == null) return one;
        
        ListNode ans = new ListNode(-1);
        ListNode dummyHead = ans;
        ListNode c1 = one;
        ListNode c2 = two;
        
        while(c1 != null && c2 != null){
            if(c1.val <= c2.val){
                // connect ans to c1
                ans.next = c1;
                c1 = c1.next;
                ans = ans.next;
                ans.next = null;
            }else{
                ans.next = c2;
                c2 = c2.next;
                ans = ans.next;
                ans.next = null;
            }
        }
        
        if(c1 != null){
            ans.next = c1;
        }else{
            ans.next = c2;
        }
        
        ListNode temp = dummyHead.next;
        dummyHead.next = null;
        dummyHead = null;
        
        
        return temp;
    }
}



// ROUGH WORK





