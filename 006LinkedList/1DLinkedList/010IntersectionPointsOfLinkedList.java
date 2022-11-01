// problem -- https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // claim := This algorithm will take atmost 2 traversals
        // very non-intuitive

        ListNode ptrA = headA;
        ListNode ptrB = headB;
        
        while(ptrA != ptrB){
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        
        return ptrA; // return ptrB;
    }
}


// ROUGH WORK










