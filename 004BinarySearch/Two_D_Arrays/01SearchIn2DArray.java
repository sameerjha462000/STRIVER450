// problem -- https://leetcode.com/problems/search-a-2d-matrix/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = (m*n)-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            // since a 2D matrix is stored in the row major form
            int r = mid / n;
            int c = mid % n;
            
            int val = matrix[r][c];
            
            if(val == target){
                return true;
            }else if(val < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return false;
    }
}


// ROUGH WORK






