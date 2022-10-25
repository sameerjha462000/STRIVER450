// problem -- https://leetcode.com/problems/koko-eating-bananas/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        
        if(h == piles.length) return high; // eat the bananas with max speed
        
        int speed = Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = (low + high) >> 1;
            
            // current speed is mid
            // find the time taken for current speed
            
            long tt = timeTaken(piles, mid); // as tt can be long as well

            if(tt <= (long)h){

                // If the time taken with speed mid is less than or equal to h, then record the current speed and try to decrease the speed.
                speed = mid;
                
                high = mid-1;
            }else{
                // tt > h
                // This means that we are eating at a slow rate
                // increase the speed

                low = mid+1;
            }
        }
        
        return speed;
    }
    
    // helper function to tell the time taken for eating the piles of bananas with speed == mid
    private static long timeTaken(int[] piles, int mid){
        long ans = 0;
        
        for(int bananas : piles){
            ans += (long)Math.ceil((1.0 * bananas) / mid);
        }
        
        return ans;
    }
    
    // helper funtion to find the max number of bananas in the piles.
    private static int max(int[] piles){
        int max = Integer.MIN_VALUE;
        
        for(int bananas : piles){
            max = Math.max(bananas, max);
        }
        
        return max;
    }
}



// ROUGH WORK





