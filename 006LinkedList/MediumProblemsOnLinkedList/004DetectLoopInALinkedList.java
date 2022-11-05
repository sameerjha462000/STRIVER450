// problem -- https://bit.ly/3QN8PLn
class Solution {
    public static boolean detectLoop(Node head){
        if(head == null && head.next == null) return false;
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) return true;
        }
        
        return false;
    }
}


// ROUGH WORK





