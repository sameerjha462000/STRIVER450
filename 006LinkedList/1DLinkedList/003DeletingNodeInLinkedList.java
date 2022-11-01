// problem -- https://leetcode.com/problems/delete-node-in-a-linked-list/
class Solution {
    public void deleteNode(ListNode node) {
        // node is not the last node
        // all the values in the list are UNIQUE
        
        // The only thing which I can do is just shift the values
        
        ListNode curr = node;
        ListNode next = node.next;
        
        while(next.next != null){
            // put the value of next in curr
            curr.val = next.val;
            curr = next;
            next = next.next;
        }
        curr.val = next.val;
        curr.next = null;
        
    }
}



// ROUGH WORK






