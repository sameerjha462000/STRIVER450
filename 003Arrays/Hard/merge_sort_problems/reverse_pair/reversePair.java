class Solution {
    public int reversePairs(int[] nums){
        return mergeSort(nums, 0, nums.length-1);
    }
    
    private static int mergeSort(int[] nums, int start, int end){
        int revCount = 0;
        if(start < end){
            int mid = (start + end) /2;
            revCount += mergeSort(nums, start, mid);
            revCount += mergeSort(nums, mid+1, end);
            revCount += mergeTwoSortedArrays(nums, start, mid, end);
        }
        
        return revCount;
    }
    
    private static int mergeTwoSortedArrays(int[] nums, int start, int mid, int end){
        int leftSize = mid - start + 1;
        int rightSize = end - mid; // end-(mid+1)+1
        
        int[] left = new int[leftSize];
        int[] right =new int[rightSize];
        
        for(int i = 0; i < left.length; i++){
            left[i] = nums[start+i];
        }
        
        for(int i = 0; i < right.length; i++){
            right[i] = nums[mid + 1 + i];
        }
        
        int i = 0;
        int j = 0;
        int k = start;
        int count = 0;
        
        /**
         * Count such pairs seperately
         **/
        while(i < left.length && j < right.length){
            // Why convert into long ?
            // Because 2 * right[j] might overflow and become negative.
            if((long)left[i] > (long)2 * (long)right[j]){
                count += left.length-i;
                j++;
            }else{
                i++;
            }
        }
        
        i = 0; j = 0;
        
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            }else{
                nums[k++] = right[j++];
            }
        }
        
        while(i < left.length) nums[k++] = left[i++];
        while(j < right.length) nums[k++] = right[j++];
        
        return count;
    }
}