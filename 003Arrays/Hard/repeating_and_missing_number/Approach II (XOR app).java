class Solve {
    int[] findTwoElement(int nums[], int n) {
        int xor = 0;
        
        for(int i = 0; i < n;i++){
            xor ^= (i+1) ^ nums[i];
        }
        
        // xor = X ^ Y
        
        int mask = (xor & (-xor));
        
        List<Integer> zeroes = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        
        for(int i = 0; i <nums.length;i++){
            if((nums[i] & mask) == 0) zeroes.add(nums[i]);
            else ones.add(nums[i]);
        }
        
        int xorZeroes = 0;
        int xorOnes = 0;
        
        for(Integer zero : zeroes) xorZeroes ^= zero;
        for(Integer one : ones) xorOnes ^= one;
        
        for(int i = 1; i <= n;i++){
            if((i & mask) == 0) xorZeroes ^= i;
            else xorOnes ^= i;
        }
        
        boolean flag = false;
        
        for(int num : nums){
            if(num == xorZeroes) {
                flag = true;
                break;
            }
        }
        
        int[] ans = new int[2];
        
        if(flag){
            // xorZeroes is repeating
            ans[0] = xorZeroes;
            ans[1] = xorOnes;
        }else{
            ans[0] = xorOnes;
            ans[1] = xorZeroes;
        }
        
        return ans;
        
    }
}



// ROUGH WORK





