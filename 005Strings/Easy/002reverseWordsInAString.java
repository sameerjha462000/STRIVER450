// problem -- https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {

        // For storing every word in the string s
        Stack<String> stack = new Stack<>();
        
        // This will store every individual word in the string s
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

        // For pushing the last word into the stack
        if(temp.length() != 0)
            stack.push(temp.toString());
        
        StringBuilder ans = new StringBuilder();
        
        // Just pop the words from the stack and put them into the ans to form a string
        while(stack.size() != 0){
            ans.append(stack.pop());
            
            // since we won't add space after the last word
            if(stack.size() != 0) ans.append(" ");
        }
        
        return ans.toString();
    }
}



// ROUGH WORK






