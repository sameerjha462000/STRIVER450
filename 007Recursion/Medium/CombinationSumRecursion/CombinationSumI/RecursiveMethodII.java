// problem -- https://leetcode.com/problems/combination-sum/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, 0, new ArrayList<>(), ans);
        return ans;
    }
    
    private static void helper(int[] candidates, int target, int idx, int sum, List<Integer> temp, List<List<Integer>> ans){
        if(sum > target) return ;
        
        if(idx == candidates.length){
            if(sum == target) ans.add(new ArrayList(temp));
            return ;
        }
        
        // do NOT pick the element at the index idx
        helper(candidates, target, idx+1, sum, temp, ans);
        
        int val = candidates[idx];
        
        for(int times = 1 ; times * val <= target; times++){
            
            sum += times * val;
            for(int j = times ; j > 0 ;j--) temp.add(val);
            helper(candidates, target, idx+1, sum, temp, ans);
            
            for(int j = times; j > 0; j--) temp.remove(temp.size()-1);
            sum -= times * val;
        }
        
    }
}


// ROUGH WORK






