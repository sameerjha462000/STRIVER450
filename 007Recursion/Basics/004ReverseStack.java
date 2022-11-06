// problem -- https://bit.ly/3podAiY
class Solution
{ 
    public static void reverse(Stack<Integer> s)
    {
        if(s.size() == 0 || s.size() == 1) return ;
        
        // take the topmost element
        int top = s.pop();
        
        // reverse the remaining stack
        reverse(s);
        
        // place the top at the bottom of the stack
        placeAtBottom(top, s);
        
    }
    
    private static void placeAtBottom(int top, Stack<Integer> s){
        if(s.size() == 0){
            s.push(top);
            return ;
        }
        
        Stack<Integer> supp = new Stack<>();
        
        while(!s.isEmpty()){
            supp.push(s.pop());
        }
        
        // now since the stack s is empty, push the top in the stack s
        s.push(top);
        
        while(!supp.isEmpty()){
            s.push(supp.pop());
        }
    }
}


// ROUGH WORK






