// problem -- https://leetcode.com/problems/copy-list-with-random-pointer/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Node dummy = new Node(-1);
        Node dummyHead = dummy;
        Node c = head;
        while(c != null){
            Node n = new Node(c.val);
            dummy.next = n;
            dummy = n;
            c = c.next;
        }
        
        // truncat the cloned list
        Node temp = dummyHead.next;
        dummyHead.next = null;
        dummyHead = temp;
                
        // now add the random pointers
        Node c1 = head;
        Node c2 = dummyHead;
        
        Map<Node, Node> map = new HashMap<>();
        Map<Node, Node> map2 = new HashMap<>();
        while(c1 != null && c2 != null){
            map.put(c2, c1);
            map2.put(c1, c2);
            c2 = c2.next;
            c1 = c1.next;
        }
        
        Node c3 = dummyHead;
        while(c3 != null){
            c3.random = map2.get(map.get(c3).random);
            c3 = c3.next;
        }
        
        return dummyHead;
    }
}


// ROUGH WORK






