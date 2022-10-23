// problem -- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fi = -1; // first index of target in nums
        int li = -1; // last index of target in nums
        
        int l = 0;
        int r = nums.length-1;
        
        // bs for finding the first index of target in nums
        while(l <= r){
            int m = r + (l-r)/2;
            
            if(nums[m] == target){
                // since nums[m] = target so this could be the first index.
                // Now even if we find nums[index] = target for any index > m, then that would be useless as we are not interested in that region.
                // So we can discard the region from [m, nums.length-1]. Thus, r = m-1
                fi = m;
                r = m-1;
            }else if(nums[m] < target){
                // since nums[m] < target
                // This means that we would not find target in [0, m]. So discard it 
                l = m + 1;
            }else{
                // since nums[m] > target
                // This means that we would not find target in [m, nums.length-1]. So discard it
                r = m - 1;
            }
        }
        l = 0;
        r = nums.length-1;
        
        // bs for finding the last index of target in nums
        while(l <= r){
            int m = r + (l - r)/2;
            
            if(nums[m] == target){
                // since nums[m] = target so this could be our last index.
                // Now there is no point in searching in the region [0, m-1].
                // So we can discard the region from [0, m]. Thus, l = m + 1
                li = m;
                l = m + 1;
            }else if(nums[m] < target){
                // since nums[m] < target
                // This means that we would not find target in [0, m]. So discard it 
                l = m + 1;
            }else{
                // since nums[m] > target
                // This means that we would not find target in [m, nums.length-1]. So discard it
                r = m - 1;
            }
        }
        return new int[]{fi, li};
    }
}


// ROUGH WORK







