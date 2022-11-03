// problem -- https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1
class GfG
{
    public Node flatten(Node root)
    {
        // if the list has no nodes or has only one node, then no need to flatten it
        if(root == null || root.next == null) return root;
        
        // now flatten the rest of the list
        Node rres = flatten(root.next);
        root.next = null; // disconnect the flattened list from the root of the original list
        
        Node dummy = new Node(Integer.MAX_VALUE);
        Node dummyHead = dummy; // to store the head of the dummy list
        
        Node c1 = root;
        Node c2 = rres;
        
        // This is the same like merge sort
        while(c1 != null && c2 != null){
            if(c1.data <= c2.data){
                // connect the node pointed by c1 to dummy
                dummy.bottom = c1;
                dummy = dummy.bottom;
                c1 = c1.bottom;
            }else{
                dummy.bottom = c2;
                dummy = dummy.bottom;
                c2 = c2.bottom;
            }
            
            dummy.bottom = null; // disconnect the bottom of dummy from the lists(this is extra step)
        }
        
        if(c1 != null) dummy.bottom = c1;
        else dummy.bottom = c2;
        
        // now disconnect the dummy node from the list
        Node temp = dummyHead;
        temp = temp.bottom;
        
        // extra steps so that GC collects this dummy node
        dummyHead.bottom = null;
        dummyHead = null;
        
        return temp;
    }
}



// ROUGH WORK







