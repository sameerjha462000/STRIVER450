// problem -- https://leetcode.com/problems/split-array-largest-sum/
class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length) return -1;
        
        long low = max(nums);
        long high = sum(nums);
        
        if(k == nums.length) return (int)low;
        long result = -1;
        
        while(low <= high){
            
            long mid = low + (high-low)/2;
            
            if(isPossible(nums, k, mid)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return (int)result;
    }
    
    private static boolean isPossible(int[] nums, int k, long mid){
        int parts = 1;
        
        long sum = 0;
        
        for(int num : nums){
            sum += (long)num;
            if(sum > mid){
                parts++;
                sum = num;
            }
        }
        
        if(parts <= k) return true;
        return false;
    }
    
    private static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        
        for(int num : nums) max = Math.max(max, num);
        
        return max;
    }
    
    private static long sum(int[] nums){
        long sum = 0;
        
        for(int num : nums) sum += (long)num;
        
        return sum;
    }
}


// ROUGH WORK








