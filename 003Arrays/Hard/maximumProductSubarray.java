// problem -- https://leetcode.com/problems/maximum-product-subarray/
class Solution {
    // This is a genius problem. I do not know who devised this algorithm but he must be close to a genius.
    // Average people would not be able to appreciate the beauty of this problem
    // They would NOT be able to understand how deep this problem is. I repeat "average" people
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        
        // claim := If for all index in [0, nums.length-1] arr[index] != 0, then the maximum product subarray would either start from the 0th index or end at the last index
        
        // claim 2 : In case some entry is 0, we may find a subarray which may neither start from the 0th index nor end at (nums.length-1)th index.
        
        int currentProd = 1;
        
        for(int i = 0; i < nums.length;i++){
            currentProd *= nums[i];
            
            ans = Math.max(ans, currentProd);
            if(currentProd == 0)
            {
                currentProd = 1;
            }
        }
        
        currentProd = 1;
        for(int i = nums.length-1; i >= 0;i--){
            currentProd *= nums[i];
            
            ans = Math.max(ans, currentProd);
            if(currentProd == 0)
                currentProd = 1;
        }
        
        return ans;
    }
}



// ROUGH WORK







