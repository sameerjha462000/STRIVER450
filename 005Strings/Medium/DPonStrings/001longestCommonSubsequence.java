// problem -- https://leetcode.com/problems/longest-common-subsequence/
class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        // dp[i][j] = LCS of s[0, i] and t[0, j]
        int[][] dp = new int[m][n];
        
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                dp[i][j] = -1;
            }
        }

        return helper(m-1, n-1, s, t, dp);
    }
    
    private static int helper(int index1, int index2, String s, String t, int[][] dp){
        
        // if index1 < 0 or index2 < 0 then that means we have exhausted either of the strings and thus the answer would be 0
        if(index1 < 0 || index2 < 0) return 0;
        
        if(dp[index1][index2] != -1) return dp[index1][index2];
        
        // if the characters match, then we add the 1 to the answer and ask for the LCS of s[0, index1-1] and t[0, index2-1]
        if(s.charAt(index1) == t.charAt(index2)) return dp[index1][index2] = 1 + helper(index1-1, index2-1, s, t, dp);
        
        // if the characters do not match, we consider both the possibilites
        return dp[index1][index2] = Math.max(helper(index1-1, index2, s, t, dp), helper(index1, index2-1, s, t, dp));
    }
}



// ROUGH WORK







