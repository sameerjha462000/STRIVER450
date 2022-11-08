// problem -- https://leetcode.com/problems/combination-sum-ii/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, new ArrayList(), ans);
        return ans;
    }
    
    private static void helper(int[] candidates, int target, int idx, List<Integer> temp, List<List<Integer>> ans){
        if(target < 0) return;
        if(idx == candidates.length){
            if(target == 0) ans.add(new ArrayList(temp));
            return;
        }
        
        int val = candidates[idx];
        
        if(val <= target){
            temp.add(val);
            helper(candidates, target-val, idx+1, temp, ans);
            temp.remove(temp.size()-1);
        }
        
        // if you are not including val then shift index to a value which is not equal to val
        while(idx < candidates.length && candidates[idx] == val) idx++;
        helper(candidates, target, idx, temp, ans);
    }
}



// ROUGH WORK






