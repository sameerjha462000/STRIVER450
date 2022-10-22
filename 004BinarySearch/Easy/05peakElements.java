// problem -- https://leetcode.com/problems/find-peak-element/
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        
        int ans =  0;
        
        while(l <= r){
            int m = (l + r)/2;
            int prev = (m-1 >= 0) ? (nums[m-1]) : (Integer.MIN_VALUE); // as nums[-1] = -Infinity
            int curr = (m+1 < nums.length) ? (nums[m+1]) : (Integer.MIN_VALUE); // as nums[n] = -Infinity
            
            if(prev < nums[m] && nums[m] > curr){ // This is the peak element
                ans = m;
                break;
            }else if(prev <= nums[m] && nums[m] <= curr){
                l = m+1; // We are guaranteed to have peak in [m+1, nums.length-1] (Why ?)
            }else if(prev >= nums[m] && nums[m] >= curr){
                r = m-1; // We are guaranteed to have peak in [0, m-1] (why ?)
            }else{
                // We can move in any direction since we are guaranteed to have in peak in both the directions
                // l = m+1;
                r = m-1;
            }
        }
        
        return ans;
    }
}