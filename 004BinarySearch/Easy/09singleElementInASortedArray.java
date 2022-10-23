// problem -- https://leetcode.com/problems/single-element-in-a-sorted-array/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        if(nums.length == 1) return nums[0];

        int single = 0;

        while(l <= r){

            int m = l + (r-l)/2;
            
            // covering the edges
            if(m == 0 && m+1 < nums.length && nums[m] != nums[m+1]) return nums[0];
            if(m == nums.length-1 && nums[m] != nums[m-1]) return nums[nums.length-1];
            

            if(m-1 >= 0 && nums[m] != nums[m-1] && m+1 < nums.length && nums[m] != nums[m+1]){
                return nums[m];
            }
            else if(m-1 >= 0 && nums[m] == nums[m-1]){
                int len = m-l+1;
                
                if(len % 2 == 0){
                    // since len % 2 == 0 and nums[m] == nums[m-1]
                    // Thus we can discard the ss [l, m]
                    l = m+1;
                }else{
                    // we cannot discard the left part
                    // unique element is surely here
                    // in the left part
                    r = m-2;
                }
            }else if(m+1 < nums.length && nums[m] == nums[m+1]){
                int len = r - m + 1;
                
                if(len % 2 == 0){
                    // since nums[m] == nums[m+1] and we have an even number of elements in [m, r]
                    // we are sure to not find the unique element in [m, r]
                    r = m-1;
                }else{
                    l = m+2;
                }
            }
        }
        
        
        return single;
        
        
    }
}



// ROUGH WORK






