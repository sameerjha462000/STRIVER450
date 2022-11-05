// problem -- https://bit.ly/3zY03mT
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head == null || head.next == null) return head;
        
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}


// ROUGH WORK




