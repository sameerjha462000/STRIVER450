// problem -- https://leetcode.com/problems/rotate-string/
class Solution {
    // Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
    // A shift on s consists of moving the leftmost character of s to the rightmost position.
    // For example, if s = "abcde", then it will be "bcdea" after one shift.

    public boolean rotateString(String s, String goal) {
        for(int i = 0 ; i < s.length();i++){
            String x = s.substring(0, i);
            String y = s.substring(i);
            
            if(goal.equals(y+x)) return true;
        }
        return false;
    }
}



// ROUGH WORK






