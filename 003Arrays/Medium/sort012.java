// problem -- https://leetcode.com/problems/sort-colors/
class Solution {
    // This is the Dutch National Flag Algorithm
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        
        
        // [0, i-1] 0's -- I region
        // [i, j-1] 1's -- II region
        // [j, k] unknowns -- III region
        // [k+1, nums.length-1] 2's -- IV region
        
        while(j <= k){
            
            if(nums[j] == 0){
                // since we have got a 0 over here we need to throw this into the I region
                int temp = nums[j];
                nums[j] = nums[i]; // nums[i] = 1 as i is an end point of II region
                nums[i] = temp;
                
                i++; // expansion of I region
                j++; // shrinking of III region and expansion of II region as nums[j] = 1 now.
            }else if(nums[j] == 2){
                // since we have got a 2 over here we need to throw this into the IV region
                int temp = nums[j];
                nums[j] = nums[k]; //  since k is in III region thus we do not know if nums[k] is 0, 1, 2
                nums[k] = temp;
                
                /**
                 * But why did we not do j++ ?
                 * 
                 * Reason := Since we do not know what value came at nums[j] when we swapped it with nums[k](as we did not know the value at kth index)
                 * Thus we have a value whose fate is yet to be decided
                 * 
                 * So, no j++.
                 **/
                k--; // expansion of IV region
            }else{
                // here nums[j] = 1, that means we need to expand the II region and this would then also shrink the II region
                j++;
            }
        }
    }
}


// ROUGH WORK





