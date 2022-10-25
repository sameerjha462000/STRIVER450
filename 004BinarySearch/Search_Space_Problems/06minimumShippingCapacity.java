// problem -- https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = max(weights);
        int high = sum(weights);
        
        int result = low;

        while(low <= high){

            int mid = (low + high) >> 1;
            if(isPossible(weights, days, mid)){
                // store the result and decrease the maximum load
                result = mid;
                
                high = mid-1;
            }else{
                // since the number of days taken is more than days
                // thus we increase the capacity

                low = mid+1;
            }
        }
        
        return result;
    }
    
    private static boolean isPossible(int[] weights, int days, int mid){
        
        int ans = 1;
        
        int cap = 0;
        for(int weight : weights){
            
            if(cap + weight > mid){
                ans++;
                cap = 0;
            }
            
            cap += weight;
        }
        
        if(cap > mid) ans++;
        return ans <= days;
    }
    
    private static int sum(int[] weights){
        int sum = 0;
        for(int weight : weights) sum += weight;
        
        return sum;
        
    }
    
    private static int max(int[] weights){
        int max = Integer.MIN_VALUE;
        for(int weight : weights){
            max = Math.max(max, weight);
        }
        
        return max;
    }
}




// ROUGH WORK







