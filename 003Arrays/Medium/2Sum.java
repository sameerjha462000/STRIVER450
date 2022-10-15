// problem -- https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        
        for(int i = 0; i < nums.length;i++){
            int val = nums[i];
            
            if(map.containsKey(target-val)){
                ans[0] = map.get(target-val);
                ans[1] = i;
                break;
            }else{
                map.put(val, i);
            }
       }
        
        
        return ans;
    }
}