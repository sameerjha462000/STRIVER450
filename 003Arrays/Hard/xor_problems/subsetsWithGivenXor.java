// problem -- https://bit.ly/3PrvhZs
class Solution{
    private static int count = 0;
    static int subsetXOR(int nums[], int N, int K) {
        count = 0 ;
        subsetXORHelper(nums, 0, 0, K);
        return count;
    }
    
    
    private static void subsetXORHelper(int[] nums, int index, int xor, int K){
        if(index < 0 || index >= nums.length) return;
        
        
        int newXor = xor ^ nums[index];
        
        if(newXor == K) count++;
        
        subsetXORHelper(nums, index + 1, newXor, K); // included the nums[index] in the xor
        subsetXORHelper(nums, index + 1, xor, K); // excluded the nums[index] in the xor
        
        
    }
}


// ROUGH WORK





