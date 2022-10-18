// problem -- https://www.interviewbit.com/problems/subarray-with-given-xor/
class Solution{
    private static int count = 0;
    static int subarrayXOR(int nums[], int N, int K){
        int count = 0;
        int xor  = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++){
            xor  = xor ^ nums[i];
            
            if(xor ==  K) count++;
            
            if(map.containsKey(xor ^ K)){ // think this yourself
                int freq = map.get(xor ^ K);
                
                count += freq; // how many times the xor ^ K subarray has ocurred
            }
            
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        
        return count;
    }
}


// ROUGH WORK





