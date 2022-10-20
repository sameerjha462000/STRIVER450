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
         * Added 20 October 2022
         * This approach would skip the pairs
         * Dry run on left = [3, 4, 5] and right = [1, 2]
         * The reverse pairs are (3, 1), (4, 1), (5, 1) and (5, 2). Thus there are 4 pairs
         * but our algorithm would count only 3 pairs, It will skip the pair (5, 2)
         **/
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            }else{
                if(left[i] > 2 * right[j])
                    count += left.length-i; // keeping j fixed
                nums[k++] = right[j++];
            }
        }
        
        while(i < left.length) nums[k++] = left[i++];
        while(j < right.length) nums[k++] = right[j++];
        
        return count;
    }
}