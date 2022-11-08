// problem -- https://leetcode.com/problems/subsets/submissions/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // we will be starting from the 0th index
        helper(nums, new ArrayList<>(), 0, ans);
        
        return ans;
    }
    
    // This means that start from the idx index
    private static void helper(int[] nums, List<Integer> temp, int idx, List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(temp)); //  copying all the values from temp into a new arraylist and then adding that into the ans
        
        for(int start = idx; start < nums.length; start++){
            temp.add(nums[start]);
            
            // Now that you have included the element at the idx index, we move on to the next index
            helper(nums, temp, start+1, ans);
            
            // this is for backtracking
            temp.remove(temp.size()-1);
        }
    }
}


// ROUGH WORK





