// problem -- https://leetcode.com/problems/spiral-matrix/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int totalElements = m * n;
        
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;
        
        while(totalElements > 0){
            // top wall
            for(int row = startRow, col = startCol; col < endCol && totalElements > 0 ; col++){
                ans.add(matrix[row][col]);
                totalElements--;
            }
            
            // right wall
            for(int row = startRow,col = endCol; row <= endRow && totalElements > 0; row++){
                ans.add(matrix[row][col]);
                totalElements--;
            }
            
            // bottom wall
            for(int row = endRow, col = endCol-1; col > startCol && totalElements > 0; col--){
                ans.add(matrix[row][col]);
                totalElements--;
            }
            
            // left wall
            for(int row = endRow, col = startCol; row > startRow && totalElements > 0;row--){
                ans.add(matrix[row][col]);
                totalElements--;
            }
            
            // shrink the boundaries
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}


// ROUGH WORK






