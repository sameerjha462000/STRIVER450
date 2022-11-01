// problem -- https://bit.ly/3Apg5aX
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        if(head == null) return 0;
        
        int count = 0;
        
        while(head != null){
            count++;
            head = head.next;
        }
        
        return count;
    }
}


// ROUGH WORK







