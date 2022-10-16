// problem -- https://leetcode.com/problems/longest-consecutive-sequence/
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0; // just a corner case

        Map<Integer, Boolean> ynMap = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            ynMap.put(nums[i], true);
        }

        // finding the possible starting elements for such sequences
        for(int i = 0; i < nums.length;i++){
            int val = nums[i] + 1;

            // since nums[i] is present in the array how can the longest sequence start from nums[i] + 1
            if(ynMap.containsKey(val)) ynMap.put(val, false);
        }

        /**
         * This map would store all the starting points of consecutive sequences and also their lengths
         **/
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            int val = nums[i];

            // If ynMap.get(val) == true, then this means that we can have a sequence starting from val
            if(ynMap.get(val)) map.put(val, 1); // as the length of the sequence right now is 1
        }

        /**
         * This loop would find the length of the longest sequence possible with each val
         **/
        for(Integer candidate : map.keySet()){
            
            int val = candidate;
            while(true){
                if(ynMap.containsKey(val + 1)){
                    map.put(candidate, map.get(candidate) + 1);
                    val++;
                }else{
                    break;
                }
            }
        }

        /**
         * Now in map we have all the Integers with which a sequence can start and the length of the longest sequence with that key as the starting point
         * We just need to find the longest among them
         **/

        int maxLength = 0;

        for(Integer candidate : map.keySet()){
            int length = map.get(candidate);

            if(maxLength < length) maxLength = length;
        }

        return maxLength;
    }
}


// ROUGH WORK







