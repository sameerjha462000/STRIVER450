// problem -- https://leetcode.com/problems/largest-odd-number-in-string/
class Solution {
    public String largestOddNumber(String num) {
        
        // just start looping from the back, the very first time you find an odd digit would be the end of the largest odd substring of the string
        for(int i = num.length()-1; i >= 0;i--){
            char ch = num.charAt(i);
            
            int value = ch - '0';
            
            // if the value is odd, then the answer is the substring till this digit i.e num.substring(0, i+1)
            if((value & 1) == 1)
                return num.substring(0, i+1);
        }

        // If you never found any odd digit while looping from the back, then the largest odd substring is the empty string.
        return "";
    }
}



// ROUGH WORK





