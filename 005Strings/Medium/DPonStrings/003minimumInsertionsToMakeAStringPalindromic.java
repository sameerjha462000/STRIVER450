// problem -- https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/
class Solution {
    public int minInsertions(String s) {
        return s.length() - LPS(s);
    }
    
    private static int LPS(String s){
        int n = s.length();
        
        int[][] dp = new int[n][n];
        
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n;j++){
                dp[i][j] = -1;
            }
        }
        
        return helper(0, n-1, s, dp);
    }
    
    private static int helper(int i, int j, String s, int[][] dp){
        if(i > j) return 0;
        
        if(i == j) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s.charAt(i) == s.charAt(j)) return dp[i][j] = 2 + helper(i+1, j-1, s, dp);
        
        return dp[i][j] = Math.max(helper(i+1, j, s, dp), helper(i, j-1, s, dp));
    }
}



// ROUGH WORK







