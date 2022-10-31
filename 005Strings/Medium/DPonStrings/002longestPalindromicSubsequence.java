// problem -- https://leetcode.com/problems/longest-palindromic-subsequence/
class Solution {
    public int longestPalindromeSubseq(String s) {
        // if the length of the string is 1, then s itself is the LPS of it.
        if(s.length() == 1) return 1;
        
        int n = s.length();
        
        // dp[i][j] = LPS of s[i, j]
        int[][] dp = new int[n][n];
        
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n;j++){
                dp[i][j] = -1;
            }
        }
        
        return helper(s, 0, s.length()-1, dp);
    }
    
    private static int helper(String s, int i, int j, int[][] dp){
        // Invalid base case
        if(i > j) return 0;

        // valid base case dp[i][i] = 1 as then we are talking about a single character
        if(i == j) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        // if the characters at i and the jth index of s match, then increase the length by 2 and find the LPS of s[i+1, j-1]
        if(s.charAt(i) == s.charAt(j)) return dp[i][j] = 2 + helper(s, i+1, j-1, dp);
        
        // if the characters do not match, then find the maximum length among the LPS of s[i+1, j] and s[i, j-1]
        return dp[i][j] = Math.max(helper(s, i+1, j, dp), helper(s, i, j-1, dp));
    }
}



// ROUGH WORK





