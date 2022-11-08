// problem -- https://leetcode.com/problems/subsets-ii/
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        // This is crucial as we need to skip the same values
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        
        // same as the subsetI, we start from the 0th index
        helper(nums, new ArrayList<>(), 0, ans);
        
        return ans;
    }
    
    private static void helper(int[] nums, List<Integer> temp, int idx, List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(temp));
                
        for(int start = idx;start < nums.length;start++){
            // if the value has been included once, then we can move on to the next value different from this one
            if(start > idx && nums[start] == nums[start-1]) continue;
            
            temp.add(nums[start]);
            
            // start+1 would be first index where a value diff from the nums[idx] would be found
            helper(nums, temp, start+1, ans);
            
            // backtrack
            temp.remove(temp.size()-1);
        }
    }
}


// ROUGH WORK






