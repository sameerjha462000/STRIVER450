// problem -- https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int index = -1;
        
        while(l <= r){
            int m =  l + (r-l)/2;
            if(nums[m] == target) return m;
            else if(nums[l] <= nums[m]){
                // [l, m] is sorted (why?)
                if(nums[l] <= target && target < nums[m]){
                    // search target in [l, m-1]
                    r = m-1;
                }else{
                    // search target in [m+1, r]
                    l = m+1;
                }
            }else {
                // [m, r] is sorted
                if(nums[m] < target && target <= nums[r]){
                    // search in [m+1, r]
                    l = m+1;
                }else{
                    r = m-1;
                }
            }
        }
        return index;
    }
}


// ROUGH WORK





