// problem -- https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length; // no of flowers
        
        // since each bouquet has k flowers and we need to make such m bouquets, so the minimum
        // number of flowers needed is m * k but we have only n flowers, so if that exceeds n 
        // then it would not be possible for us to make m bouqets.
        
        if(m * k > n) return -1;
        
        // The minimum number of days required would be 1 and the maximum number of days required 
        // would be max(bloomDay)
        
        int low = min(bloomDay);
        int high = max(bloomDay);
        
        int minDays = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            // check if it possible to make m bouqets in `mid` days
            System.out.println(isPossible(bloomDay, m, k, mid));
            if(isPossible(bloomDay, m, k , mid)){
                // store the current number of days
                minDays = mid;
                // now try to decrease the number of days
                high = mid-1;
            }else{
                low = mid+1;
            }
            
        }
        
        return minDays;
    }
    
    private static boolean isPossible(int[] bloomDay, int m, int k, int mid){
        int flowers = 0;
        int bouqets = 0;
        
        for(int i = 0; i < bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                flowers++;
            }else{
                flowers = 0;
            }
            
            if(flowers == k){
                bouqets++;
                flowers = 0;
            }
        }
        
        // if the number of bouqets exceeds m, then it is possible
        if(bouqets >= m) return true;
        return false;
    }
    
    private static int min(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        
        for(int day : bloomDay) min = Math.min(min, day);
        return min;
    }
    
    private static int max(int[] bloomDay){
        int max = Integer.MIN_VALUE;
        
        for(int day : bloomDay) max = Math.max(max, day);
        return max;
    }
}



// ROUGH WORK






