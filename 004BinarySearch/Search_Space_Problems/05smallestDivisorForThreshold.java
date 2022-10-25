// problem -- https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        
        int n = nums.length;
        // The minimum value of threshold can be n
        if(threshold < n) return -1;
        
        int result = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(divide(nums, mid) <= (long)threshold){
                result = mid;
                
                // try to decrease the result (as we want the smallest divisor)
                high = mid-1;
            }else{
                low = mid+1;
            }
            
        }
        
        return result;
    }
    
    private static long divide(int[] nums, int mid){
        long ans = 0;
        
        for(int num : nums){
            ans += (long)Math.ceil((1.0 * num)/mid);
        }
        
        return ans;
    }
    
    private static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        
        for(int num : nums) max = Math.max(max, num);
        
        return max;
    }
}


// ROUGH WORK





