// problem -- https://leetcode.com/problems/palindromic-substrings/
class Solution {
    public int countSubstrings(String s) {
        // T.C -- O(n2) and S.C -- O(n2)
        
        // dp[i][j] would represent the substring which starts from the index i and ends at the index j
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        // this is the way you traverse on the upper diagonals of the dp matrix
        for(int gap = 0; gap < s.length();gap++){
            // all diagonals start from the 0th row and end at the last column
            for(int row = 0, col = gap ; col < s.length() ; row++, col++){
                if(gap == 0) dp[row][col] = true;
                else if(gap == 1){
                    if(s.charAt(row) == s.charAt(row+1)) dp[row][col] = true;
                }else{
                    if(s.charAt(row) == s.charAt(col)) dp[row][col] = dp[row+1][col-1];
                }
            }
        }
        
        int count = 0;
        
        // now traverse in the matrix to find the number of trues
        for(int gap = 0; gap < s.length();gap++){
            for(int row = 0, col = gap; col < s.length();row++,col++){
                if(dp[row][col]) count++;
            }
        }
        
        return count;
    }
}