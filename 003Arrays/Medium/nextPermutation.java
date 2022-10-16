class Solution {
    public void nextPermutation(int[] nums) {
        
        int i = nums.length-2;
        int j = nums.length-1;
        
        // This is done to find the lexigraphically greatest permutation from the end
        while(i >= 0 && j >= 0 && nums[i] >= nums[j]){
            i--;
            j--;
        }
        
        int pivot = i;

        if(i < 0){
            // If i < 0, then that means that i = -1 which means that the array was sorted in the decreasing order
            // Thus the next permutation would be the permutation which is sorted in increasing order which could be obtained
            // just by reversing this array and return
            reverse(i+1, nums.length-1, nums);
            return;
        }

        int pivotVal = nums[pivot];
        
        i = nums.length-1;
        
        while(i >= 0 && nums[i] <= pivotVal){
            // to find the next number greater than nums[pivot]. Because the next permuation will start from
            // the number which is just greater than nums[pivot]
            i--;
        }
        
        int pivotSwapper = i; // Index of the number which is just greater than nums[pivot]
        
        /**
         * Now swap the nums[pivot] and the number just greater than nums[pivot]
         **/

        int temp = pivotVal;
        nums[pivot] = nums[pivotSwapper];
        nums[pivotSwapper] = temp;
        
        /**
         * Now just sort the array after the pivot index.
         * This could just be done by reversing the array(why?)
         **/
        reverse(pivot+1, nums.length-1, nums);
    }
    
    private static void reverse(int i, int j, int[] nums){
        int start = i;
        int end = j;
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}


// ROUGH WORK






