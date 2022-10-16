// problem -- https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(prev);
        for(int i = 1; i < numRows;i++){
            int start = -1;
            int end = 0;
            
            List<Integer> curr = new ArrayList<>();
            
            // prev is of size i, so the last index of prev would be i-1
            while(end <= i){
                int val1 = (start >= 0) ? (prev.get(start)) : 0 ;
                int val2 = (end < i) ? (prev.get(end)) : 0;
                
                curr.add(val1 + val2);
                start++;
                end++;
            }
            
            
            ans.add(curr);
            prev = curr;
        }
        
        
        return ans;
    }
}



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GFG ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// problem -- https://bit.ly/3C95qlR


class Solution {
    
    private static long mod = ((long)Math.pow(10, 9) + (long)7);
    
    public List<Long> nthRowOfPascalTriangle(int n) {

        List<Long> ans = new ArrayList<>();
        List<Long> prev = new ArrayList<>();
        prev.add((long)1);
        
        if(n == 1) return prev;
        
        for(int i = 2; i <= n;i++){
            ans = new ArrayList<>();
            int c1 = -1;
            int c2 = 0;
            
            // size of ans should be prev.size()+1, that means we need to generate prev.size()+1;
            int size = prev.size()+1;
            
            while(size-- != 0){
                Long val1 = (c1 < 0) ? (0) : prev.get(c1);
                Long val2 = (c2 < prev.size()) ? prev.get(c2) : (0);
                c1++;c2++;
                
                
                ans.add(((val1 % mod) + (val2 % mod)) % mod);
            }
            
            prev = ans;
            
        }
        return ans;
    }
}




// ROUGH WORK











