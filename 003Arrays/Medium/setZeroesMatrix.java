// problem -- https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isRow = false;
        boolean isCol = false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0, j = 0; j < n;j++){
            if(matrix[i][j] == 0) isRow = true;
        }
        
        for(int i = 0, j = 0; i < m;i++){
            if(matrix[i][j] == 0) isCol = true;
        }
        
        
        for(int i = 0;i < m;i++){
            for(int j = 0; j < n;j++){
                if(i == 0 || j == 0) continue;
                
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || j == 0) continue;
                
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
                
            }
        }
        
        if(isRow){
            // make 0th row all zeroes
            for(int row = 0, col = 0; col < n;col++) matrix[row][col] = 0;
        }
        
        if(isCol){
            // make 0th col all zeroes
            for(int row = 0, col = 0; row < m; row++) matrix[row][col] = 0;
        }
    }
}



// ROUGH WORK




