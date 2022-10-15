// problem -- https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        
        
        // [0, i-1] 0's
        // [i, j-1] 1's
        // [j, k] unknowns
        // [k+1, nums.length-1] 2's
        
        while(j <= k){
            
            if(nums[j] == 0){
                int temp = nums[j]; // 0
                nums[j] = nums[i]; // 1
                nums[i] = temp;
                
                i++; // to shrink the region of 1's
                j++;
            }else if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                
                k--;
            }else{
                j++;
            }
        }
    }
}


// ROUGH WORK





