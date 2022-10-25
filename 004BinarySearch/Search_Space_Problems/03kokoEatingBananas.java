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
                speed = mid;
                // decrease the speed
                
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
    
    private static long timeTaken(int[] piles, int mid){
        long ans = 0;
        
        for(int bananas : piles){
            ans += (long)Math.ceil((1.0 * bananas) / mid);
        }
        
        return ans;
    }
    
    private static int max(int[] piles){
        int max = Integer.MIN_VALUE;
        
        for(int bananas : piles){
            max = Math.max(bananas, max);
        }
        
        return max;
    }
}



// ROUGH WORK





