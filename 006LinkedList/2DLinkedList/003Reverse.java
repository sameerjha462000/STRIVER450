// problem -- https://bit.ly/3w6hUaa
public static Node reverseDLL(Node  head)
{
    if(head == null || head.next == null) return head;
    
    // go to the last of the DLL
    while(head.next != null) head = head.next;
    
    // swap the prev and next pointer of the head
    Node curr = head;
    Node prev = curr.prev;
    Node next = curr.next;

    curr.next = prev;
    curr.prev = next;
    curr = curr.next;
    
    // Now swap the prev and next pointer of the other nodes
    while(curr != null && curr.next != null){
        // swap the prev and next pointers of curr
        prev = curr.prev;
        next = curr.next;
        
        curr.next = prev;
        curr.prev = next;
        
        // move to the next node
        curr = curr.next;
    }
    return head;
}




// ROUGH WORK







