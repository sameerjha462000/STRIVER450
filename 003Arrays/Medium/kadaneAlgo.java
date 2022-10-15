// problem -- https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int overallSum = nums[0];
        
        for(int i = 1;i < nums.length;i++){
            if(currentSum >= 0){
                // then no matter what the value of nums[i] is, just add it
                currentSum += nums[i];
            }else{
                // this time currentSum is -ve, so we can have two cases
                // either nums[i] >= 0 then start from here
                // and in case nums[i] < 0, then adding it to the currentSum would only decrease the sum
                // so just start from the nums[i]
                
                currentSum = nums[i];
            }
            
            
            if(currentSum > overallSum){
                overallSum = currentSum;
            }
        }
        
        
        return overallSum;
        
    }
}



// ROUGH WORK






