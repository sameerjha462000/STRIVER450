// problem -- https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        
        int min = Integer.MAX_VALUE;
        while(l <= r){
            int m = l + (r - l)/2;
            
            if(nums[m] < min) min = nums[m];
            else if(nums[l] < nums[m]){
                
                // l to m is sorted in ascending order -- nums[l] <= ... <= nums[m]
                // so just update the minimum with nums[l] and discard [l, m]

                min = Math.min(min, nums[l]);

                // and now move to the right part
                l = m+1;
            }else{
                // m to r is sorted -- nums[m+1] <= ... <= nums[r]
                // so just update the minimum with nums[m] and discard [m ,r]

                /**
                 * But then why not check with nums[m]?
                 * Since we have already checked min with nums[m] in the start
                 **/

                min = Math.min(min, m+1 < nums.length ? nums[m+1] : Integer.MAX_VALUE);
                r = m-1;               
            }
        }
        
        return min;
    }
}




// ROUGH WORK








