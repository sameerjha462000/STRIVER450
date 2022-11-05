// problem -- https://bit.ly/3dyXL6m
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        if(head == null) return 0;
        if(head.next == null) return 0;
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                break;
            }
        }
        
        if(fast == null || fast.next == null) return 0;
        
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        int count = 1;
        while(fast.next != slow){
            fast = fast.next;
            count++;
        }
        
        return count;
        
    }
}



// ROUGH WORK







