// problem -- https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next; //  slow moves one step
            fast = fast.next.next; // fast moves two step at a time
            
            if(slow == fast){
                // this means that we have a cycle in the list and we must break the loop
                break;
            }
        }
        
        if(fast == null || fast.next == null) {
            // this means that the list never had a cycle
            return null; // as there is no cycle so no head
        }
        
        // if we are here this means that list has a cycle
        
        // reset slow to the head of the list
        slow = head;
        
        // claim := slow and fast are equidistant from the head of the cycle
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow; // or you could have returned fast
        
    }
}



// ROUGH WORK





