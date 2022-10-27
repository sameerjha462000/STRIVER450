// problem -- https://leetcode.com/problems/remove-outermost-parentheses/
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        
        int counter = 0;
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == ')' && counter == 1) {
                counter--;
                continue;
            }
            
            if(counter != 0){
                ans.append(ch);
            }
            
            if(ch == '(') counter++;
            else counter--;
            
        }
        return ans.toString();
    }
}




// ROUGH WORK






