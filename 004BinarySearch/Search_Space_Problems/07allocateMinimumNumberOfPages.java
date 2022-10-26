// problem -- https://bit.ly/3QMrMxP
class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[] pages,int N,int M)
    {
        //Your code here
        
        if(M > N) return -1;
        
        long max = max(pages);
        
        long sum = sum(pages);
        
        long low = max;
        long high = sum;
        
        long result = -1;
        
        while(low <= high){
            long mid = low + (high-low)/2;
            
            if(isPossible(pages, M, mid)){
                // mid is the maximum number of pages allocated to a student 
                // we want to minimize the value of mid
                // so we will try to distribute books in M students such that no student
                // receives more than mid books
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)result;
    }
    
    private static boolean isPossible(int[] pages, int M, long mid){
        int ans = 1;
        
        long tnop = 0;
        for(int page : pages){
            tnop += (long)page;
            
            if(tnop > mid){
                ans++;
                tnop = (long)page;
            }
        }
        
        return ans <= M;
    }
    
    private static int max(int[] pages){
        int max = Integer.MIN_VALUE;
        for(int page : pages) max = Math.max(max, page);
        return max;
    }
    
    private static long sum(int[] pages){
        long sum = 0;
        
        for(int page : pages) sum += (long)page;
        
        return sum;
    }
};




// ROUGH WORK







