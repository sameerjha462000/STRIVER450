// problem -- https://bit.ly/3dEvWJD
class Solution {
    int findKRotation(int nums[], int n) {
        int count = 0;
        
        int l = 0;
        int r = nums.length-1;
        
        // array is sorted, so we do not need to know about the rotations
        if(nums[l] < nums[r]) return 0;

        while(l <= r){

            int m = l + (r-l)/2;
            
            // setting -Inf and +Inf at the edges of the array
            int prev = m-1 >= 0 ? nums[m-1] : Integer.MIN_VALUE;
            int next = m+1 < nums.length ? nums[m+1] : Integer.MAX_VALUE;
            
            if(nums[m] > next){
                // All the elements from [0, m] were rotated and #[0, m] = m+1
                return m+1;
            }else if(nums[m] < prev){
                // All the elements from [0, m-1] and #[0, m-1] = m
                return m;
            }else if(nums[l] < nums[m]){
                // [l, m] is sorted -- nums[l] < ... < nums[m]
                l = m+1;
            }else{
                // [m, r] is sorted -- nums[m] < ... < nums[r]
                r = m-1;
            }
        }
        return count;
    }
}


// ROUGH WORK









