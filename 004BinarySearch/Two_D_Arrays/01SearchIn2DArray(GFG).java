// problem -- https://bit.ly/3dAwi3Z
class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int row = 0;
        int col = M-1;
        
        while(row < N && col >= 0){
            if(mat[row][col] == X)
                return 1;
            else if(mat[row][col] < X){
                row++;
            }else{
                col--;
            }
        }
        return 0;
    }
}



// ROUGH WORK






