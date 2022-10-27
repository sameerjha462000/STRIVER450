// problem -- https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        
        StringBuilder temp = new StringBuilder();
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == ' ' && temp.length() != 0){
                stack.push(temp.toString());
                temp = new StringBuilder();
            }
            
            if(ch != ' ')
                temp.append(ch);
        }
        
        if(temp.length() != 0)
            stack.push(temp.toString());
        
        StringBuilder ans = new StringBuilder();
        
        while(stack.size() != 0){
            ans.append(stack.pop());
            
            if(stack.size() != 0) ans.append(" ");
        }
        
        return ans.toString();
    }
}



// ROUGH WORK






