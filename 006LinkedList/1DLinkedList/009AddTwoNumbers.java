// problem -- https://leetcode.com/problems/add-two-numbers/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        ListNode head = dummy;
        
        ListNode c1 = l1;
        ListNode c2 = l2;
        
        int carry = 0;
        while(c1 != null || c2 != null){
            int val1 = c1 == null ? 0 : c1.val;
            int val2 = c2 == null ? 0 : c2.val;
            
            int val = val1 + val2 + carry;
            
            carry = val /10;
            val = val % 10;
            
            ListNode n = new ListNode(val);
            head.next = n;
            head = n;
            
            c1 = c1 == null ? null : c1.next;
            c2 = c2 == null ? null : c2.next;
        }
        
        // if after the last addition, some carry might remain, then we need to add that as well
        if(carry > 0){
            ListNode n = new ListNode(carry);
            head.next = n;
        }
        
        head = dummy.next;
        dummy.next = null;
        dummy = null;
        
        
        return head;
    }
}



// ROUGH WORK





