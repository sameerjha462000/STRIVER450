// problem -- https://bit.ly/3QlEoMx
class Solution
{
    Node deleteNode(Node head,int x)
    {
        if(head == null) return null;
        if(x == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.prev = null;
            temp = null;
            return head;
        }
        
        x = x - 2;
        
        Node h = head;
        while(x-- != 0) h = h.next;
        
        Node curr = h.next;
        
        if(curr != null) h.next = curr.next;
        if(curr.next != null) curr.next.prev = h;
        
        if(curr != null)curr.next = null;
        if(curr != null) curr.prev = null;
        
        curr = null;
        h = null;
        
        return head;
    }
}


// ROUGH WORK







