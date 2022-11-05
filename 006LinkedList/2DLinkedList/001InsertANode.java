// problem -- https://bit.ly/3QD4hHs
class GfG
{
    void addNode(Node head_ref, int pos, int data)
	{
	    Node newNode = new Node(data);
	    
	    // Don't know why I wrote this
	   	// if(pos == 0){
	   	//     newNode.next = head_ref;
	   	//     head_ref.prev = newNode;
	   	//     newNode.prev = head_ref;
	   	//     head_ref = newNode;
	   	//     return ;
	   	// }
	    
	    
	   	// pos--;
	    
	    Node n = head_ref;
	    while(pos-- != 0){
	        n = n.next;
	    }
	    
	    newNode.prev = n;
	    newNode.next = n.next;
	    
	    if(n.next != null) n.next.prev = newNode;
	    n.next = newNode;
	    
	    n = null;
	}
}



// ROUGH WORK





