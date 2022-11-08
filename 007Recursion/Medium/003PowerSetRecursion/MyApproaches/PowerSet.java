// problem -- https://leetcode.com/problems/subsets/
class Solution {

    // This approach uses bitmasking
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        
        int nos = (int)Math.pow(2, n);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < nos;i++) {
            // we will check the binary representation of i
            // it will have n bits
            List<Integer> temp = new ArrayList<>();
            
            for(int j = 0; j < n;j++) {
                // when j = 0, we are talking about the element at the n-j-1 th index of the nums
                int mask = (1 << j); // This will decide if the element at n-j-1 th index is to be included
                
                if((mask & i) != 0) {
                    // This means that the element at n-j-1 th index is to be included
                    temp.add(nums[n-j-1]);
                }
            
            }

            // but since we were tracking in the reverse order, we need to reverse the temp and
            reverse(temp);
            
            ans.add(temp);
        }
        
        return ans;
    }
    
    // helper function to reverse the arraylist
    private static void reverse(List<Integer> temp) {
        int i = 0;
        int j = temp.size()-1;
        
        while(i <= j) {

            int tempValue = temp.get(i);
            temp.set(i, temp.get(j));
            temp.set(j, tempValue);

            i++;
            j--;
        }
    }
}


// ROUGH WORK



