// problem -- https://leetcode.com/problems/largest-odd-number-in-string/
class Solution {
    public String largestOddNumber(String num) {
        
        for(int i = num.length()-1; i >= 0;i--){
            char ch = num.charAt(i);
            
            int value = ch - '0';
            
            if((value & 1) == 1)
                return num.substring(0, i+1);
        }
        return "";
    }
}



// ROUGH WORK





