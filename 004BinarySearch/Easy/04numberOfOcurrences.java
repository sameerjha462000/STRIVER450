// problem -- https://bit.ly/3SVcOqW
class Solution {
    int count(int[] nums, int x) {
        
        int fi = -1;
        int li = -1;

        int l = 0;
        int r = nums.length-1;

        // bs for finding the first index
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == x){
                fi = m;
                r = m-1;
            }else if(nums[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        
        l = 0;
        r = nums.length-1;

        // bs for finding the last index
        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == x){
                li = m;
                l = m + 1;
            }else if(nums[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        
        if(fi == -1 && li == -1) return 0; // If we did NOT find x in nums then return 0
        return li-fi+1;
    }
}




// ROUGH WORK








