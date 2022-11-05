// problem -- https://leetcode.com/problems/reverse-nodes-in-k-group/n
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        int size = size(head);
        
        ListNode th = null;
        ListNode tt = null;
        ListNode oh = null;
        ListNode ot = null;
        
        ListNode curr = head;
        while(size >= k){
            int kAgain = k;
            while(kAgain-- != 0 && curr != null){
                ListNode next = curr.next;
                curr.next = null;
                
                // add this curr node to the temporary list
                if(th == null){
                    th = tt = curr;
                }else{
                    curr.next = th;
                    th = curr;
                }
                
                curr = next;
                size--;
            }
            
            // Now add the temporary list so created to the original list
            if(oh == null){
                oh = th;
                ot = tt;
            }else{
                if(ot != null) ot.next = th;
                ot = tt;
            }
            
            th = null;
            tt = null;
            
        }
        
        if(size > 0){
            ot.next = curr;
            ot = null;
        }
        
        return oh;
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





