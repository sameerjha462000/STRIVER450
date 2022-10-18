// problem -- https://leetcode.com/problems/majority-element-ii/
// best video solution -- https://youtu.be/Ecsg2G5luYI (Atleast this worked for me)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1 = -1;
        int val2 = -1;
        int count1 = 0;
        int count2 = 0;
        
        for(int num : nums){
            if(num == val1) count1++;
            else if(num == val2) count2++;
            else if(count1 == 0){
                val1 = num;
                count1 = 1;
            }else if(count2 == 0){
                val2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == val1) count1++;
            if(num == val2) count2++;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        if(count1 * 3 > nums.length){
            ans.add(val1);
        }
        
        if(val1 != val2 && count2 * 3 > nums.length){
            ans.add(val2);
        }
        
        return ans;
    }
}



// ROUGH WORK







