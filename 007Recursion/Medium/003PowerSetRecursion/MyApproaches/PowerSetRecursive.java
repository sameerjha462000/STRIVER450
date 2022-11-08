// problem -- https://leetcode.com/problems/subsets/
class Solution {
    // This is the recursive approach to the same problem
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans;
        
        ans = helper(nums, nums.length-1);
        
        return ans;
    }
    
    private static List<List<Integer>> helper(int[] nums, int idx) {
        if(idx == -1) {
            List<List<Integer>> ans = new ArrayList<>();

            List<Integer> empty = new ArrayList<>();
            
            ans.add(empty);
            
            return ans;
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<List<Integer>> rres = helper(nums, idx-1);
        
        for(List<Integer> x : rres) ans.add(x);
        
        for(List<Integer> x : rres) {
            List<Integer> y = new ArrayList<>();
            for(int xx : x) y.add(xx);
            
            y.add(nums[idx]);
            ans.add(y);
        }
        
        return ans;
    }
}


// ROUGH WORK





