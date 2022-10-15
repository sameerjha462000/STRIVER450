// problem -- https://leetcode.com/problems/majority-element/
class Solution {

    // This is moore's voting algorithm
    // Note := I do not understand this, but then who does ?
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 1;
        
        for(int i = 1; i< nums.length;i++){
            if(nums[i] == val){
                count++;
            }else{
                count--;
            }
            
            if(count == 0){
                val = nums[i];
                count = 1;
            }
        }
        
        
        return val;
    }
}



// ROUGH WORK






