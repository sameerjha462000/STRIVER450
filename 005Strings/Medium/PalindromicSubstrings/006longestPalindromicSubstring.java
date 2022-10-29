// problem -- https://leetcode.com/problems/longest-palindromic-substring/
class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        // the palindromic substring with the maximum gap would be the longest palindrome
        int maxGap = Integer.MIN_VALUE;

        // to mark the ends of the longest palindromic substring (both inclusive)
        int start = 0;
        int end = s.length()-1;

        // traverse on the diagonals to fill the dp matrix
        for(int gap = 0; gap < s.length();gap++){
            // all diagonals start from the 0th row and end at the last column
            for(int row = 0, col = gap ; col < s.length() ; row++, col++){
                if(gap == 0) dp[row][col] = true;
                else if(gap == 1){
                    if(s.charAt(row) == s.charAt(row+1)) dp[row][col] = true;
                }else{
                    if(s.charAt(row) == s.charAt(col)) dp[row][col] = dp[row+1][col-1];
                }
                
                // if s[row, col] is a palindrome and has greater gap than the maximum gap acheieved till now, then update
                if(dp[row][col] && maxGap < gap) {
                    maxGap = gap;
                    start = row;
                    end = col;
                }
            }
        }
        
        return s.substring(start, end+1);
    }
}



// ROUGH WORK






