// problem -- https://bit.ly/3zWZoCs
class Solve {

    int[] findTwoElement(int nums[], int n) {

        long missing = (long)0;
        long repeating = (long)0;
        
        // sum(arr)-repeating+ missing = 1 + ... + N
        long sum = (long)0;
        
        for(int i = 0; i < n;i++){
            sum += i + 1 - nums[i];
        }
        
        // now sum = missing - repeating
        
        // sum(arr2) - repeating2 +missing2 = 1@ + ... N@;
        
        long sumSquare = (long)0;
        for(int i = 0; i < n;i++){
            long toBeAdded = (long)(i + 1) * (long)(i + 1);
            sumSquare += (toBeAdded) - ((long)nums[i] * (long)nums[i]); 
        }
        
        // sum = missing - repeating
        // sumSquare = (missing-repeating) * (missing + repeating)
        
        // missing + repeating = sumSquare / sum;
        long sumOfNumbers = sumSquare/sum;
        missing = (int)(sum + sumOfNumbers)/2;
        repeating = (int)(missing - sum);
        
        int[] ans = new int[2];
        ans[0] = (int)repeating;
        ans[1] = (int)missing;
        
        return ans;
        
        
    }
}




// ROUGH WORK

// Do NOT use direct formulaes in this question as it might overflow from int.
// Also explicitly typecast everything into long as it might overflow from int.












