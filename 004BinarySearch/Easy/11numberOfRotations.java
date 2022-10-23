// problem -- https://bit.ly/3dEvWJD
class Solution {
    int findKRotation(int nums[], int n) {
        int count = 0;
        
        int l = 0;
        int r = nums.length-1;
        
        if(nums[l] < nums[r]) return 0;
        while(l <= r){
            int m = l + (r-l)/2;
            
            int prev = m-1 >= 0 ? nums[m-1] : Integer.MIN_VALUE;
            int next = m+1 < nums.length ? nums[m+1] : Integer.MAX_VALUE;
            
            if(nums[m] > next){
                return m+1;
            }else if(nums[m] < prev){
                return m;
            }else if(nums[l] < nums[m]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return count;
    }
}


// ROUGH WORK





