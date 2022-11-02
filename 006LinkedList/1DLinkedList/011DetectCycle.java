// problem -- https://leetcode.com/problems/linked-list-cycle/
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // This is the classic Floyd cycle detection algorithm
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            
            slow = slow.next;
            fast = fast.next.next;

            // if fast and slow meet at some point that means we had a cycle
            if(slow == fast){
                return true;
            }
        }

        // if fast and slow did not meet then this means we did not have a cycle in the list and thus we would break out of the loop. Hence return false
        return false;
    }
}


// ROUGH WORK





