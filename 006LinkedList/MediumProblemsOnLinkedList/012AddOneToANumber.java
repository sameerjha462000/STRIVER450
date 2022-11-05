// problem -- https://bit.ly/3piCTD3
class Solution
{
    public static Node addOne(Node head) 
    { 
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.data);
            head = head.next;
        }

        int index = list.size()-1;
        
        Node ans = new Node(-1);
        Node ref = ans; //  to store the head of ans
        
        int val = list.get(index) + 1;
        int rem = val % 10;
        int carry = val / 10;
        
        Node n = new Node(rem);
        ans.next = n;
        ans = ans.next;
        
        index = index-1;
        while(index >= 0){
            val = list.get(index) + carry;
            rem = val % 10;
            carry = val /10;
            
            n = new Node(rem);
            ans.next = n;
            ans = ans.next;
            index--;
        }
        
        if(carry > 0){
            n = new Node(carry);
            ans.next = n;
            ans = ans.next;
        }
        
        Node temp = ref.next;
        ref.next = null;
        ref = temp;
        
        // reverse the ref
        Node curr = ref;
        Node prev = null;
        
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




