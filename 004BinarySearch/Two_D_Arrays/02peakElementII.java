// problem -- https://leetcode.com/problems/find-a-peak-element-ii/
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] ans = new int[2];
        
        int startRow = 0;
        int endRow = mat.length-1;
        
        while(startRow <= endRow){
            int midRow = (startRow + endRow) / 2;
            Pair maxElementPos = helper(mat, midRow);
            
            int row = maxElementPos.row;
            int col = maxElementPos.col;
            
            int up = row == 0 ? -1 : mat[row-1][col];
            int down = row == mat.length-1 ? -1 : mat[row+1][col];
            
            int val = mat[row][col];
            
            if(val > up && val > down){
                // this is some peak shit 
                return new int[]{row, col};
            }else if(val > up && val < down){
                // we should move down as down is > val
                startRow = midRow+1;
            }else if(val < up && val > down){
                // we should move up as up is > val
                endRow = midRow-1;
            }else{
                // val < up and val < down
                // jahan dil kre wahan jaa
                endRow = midRow-1;
                // startRow = midRow+1;
            }
        }
        
        return ans;
    }
    
    // Helper function to find the position of maximum element in a row of a 2D matrix
    private static Pair helper(int[][] mat, int row){
        Pair p = new Pair();
        
        int col = 0;
        
        int max = Integer.MIN_VALUE;
        
        while(col < mat[0].length){
            if(mat[row][col] > max){
                p.row = row;
                p.col = col;
                max = mat[row][col];
            }
            col++;
        }
        return p;
    }
    
    private static class Pair{
        int row;
        int col;
        
        Pair(){}
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
        Pair(Pair other){
            this.row = other.row;
            this.col = other.col;
        }
        
        @Override
        public String toString(){
            return "[" + row + ", " + col + "]";
        }
    }
}


// ROUGH WORK







