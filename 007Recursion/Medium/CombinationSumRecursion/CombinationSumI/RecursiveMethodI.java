// problem -- https://leetcode.com/problems/combination-sum/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        helper(candidates, target, 0, new ArrayList<>(), ans);
        
        return ans;
    }
    
    private static void helper(int[] candidates, int target, int idx, List<Integer> temp, List<List<Integer>> ans){
        if(target < 0){
            return ;
        }
        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList(temp));
            }
            return ;
        }
        // pick the element
        temp.add(candidates[idx]);
        helper(candidates, target-candidates[idx], idx, temp, ans);
        temp.remove(temp.size()-1);
        // do not pick the element
        helper(candidates, target, idx+1, temp, ans);
    }
}



// ROUGH WORK







