// problem -- https://leetcode.com/problems/rotate-string/
class Solution {
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






