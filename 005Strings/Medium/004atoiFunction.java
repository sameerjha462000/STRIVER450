// problem -- https://leetcode.com/problems/string-to-integer-atoi/
class Solution {
    public int myAtoi(String s) {
        // In case the string is empty, return 0
        if(s.length() == 0) return 0;
        
        int index = 0;
        
        // for trimming the initial white-spaces
        while(index < s.length() && s.charAt(index) == ' ') index++;
        
        // update the string after removing the front white-spaces
        s = s.substring(index);
        
        // if after trimming the front white-spaces, we get empty string, then return 0
        if(s.length() == 0) return 0;
        
        // if the first character is not a digit nor a sign, then return 0
        if(!isDigit(s.charAt(0)) && !isASign(s.charAt(0))) return 0;
        
        long MAX = Integer.MAX_VALUE;
        long MIN = Integer.MIN_VALUE;
        
        int sign = +1;
        
        
        if(s.charAt(0) == '-') sign = -1; // means that the answer is negative
        
        int i = isASign(s.charAt(0)) ? 1 : 0; // this means that if the character at the first index is sign, then we would start forming the ans from the first index otherwise from the 0 index
        long ans = 0;
        
        while(i < s.length()){
            
            char ch = s.charAt(i);

            // if we have stopped getting digits, then STOP
            if(!isDigit(ch)) break;
            
            ans = ans * 10 + (ch - '0');
            
            // if the number till now has crossed the boundaries, then return the extremas.
            if(sign == -1 && -1 * ans < MIN) return (int)MIN;
            if(sign == + 1 && ans > MAX) return (int)MAX;
            
            i++;
        }
        
        return (int)(sign * ans);
    }
    
    // helper funtion to check if the given character is a Digit or not.
    private static boolean isDigit(char ch){
        int val = ch - '0';
        
        return (val >= 0) && (val <= 9);
    }
    
    // helper funtion to check if the given character is a + or - sign.
    private static boolean isASign(char ch){
        return (ch == '+') || (ch == '-');
    }
}




// ROUGH WORK








