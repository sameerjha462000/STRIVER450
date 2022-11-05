// problem -- https://leetcode.com/problems/odd-even-linked-list/
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode dne = new ListNode(-1);
        ListNode dno = new ListNode(-1);
        
        ListNode he = dne;
        ListNode ho = dno;
        
        ListNode curr = head;
        int index = 1;
        while(curr != null){
            ListNode nextList = curr.next;
            curr.next = null; // detach from the rest of the list(because it's fate is going to be decided)
            
            if(index % 2 == 0){
                // the curr index is even
                dne.next = curr;
                dne = curr;
            }else{
                // the curr index is odd
                dno.next = curr;
                dno = curr;
            }
            
            curr = nextList;
            index++;
        }
        
        // Now truncat both the lists
        ListNode temp = he.next;
        he.next = null;
        he = temp;
        temp = null;
        
        // truncat the odd list
        temp = ho.next;
        ho.next = null;
        ho = temp;
        temp = null;
        
        // connect ho to he
        dno.next = he;
        he = null;
        dno = null;
        dne = null;
        
        return ho;
    }
}


// ROUGH WORK







