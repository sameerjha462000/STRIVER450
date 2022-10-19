class Solution
{
    // Actual merge sort algorithm modified to serve our purpose
    static long inversionCount(long nums[], long N)
    {
        return mergeSort(nums,0, nums.length-1);
    }
    
    private static long mergeSort(long[] nums,int start, int end){
        long invCount = 0;
        
        if(start < end){
            
            int mid = (start + end) / 2;
            invCount += mergeSort(nums, start, mid);
            invCount += mergeSort(nums, mid+1, end);
            invCount += mergeTwoSortedArrays(nums, start, mid, end);
        }
        return invCount;
    }
    
    private static long mergeTwoSortedArrays(long[] nums, int start, int mid, int end){
        int leftSize = mid - start + 1;
        int rightSize = end - mid;
        
        long[] left = new long[leftSize];
        long[] right = new long[rightSize];
        
        // fill the left array with values from start to mid
        for(int i = 0; i < leftSize;i++){
            left[i] = nums[start + i];
        }
        
        // fill the right array with values from mid+1 to end
        for(int j = 0; j < rightSize;j++){
            right[j] = nums[mid + 1 + j];
        }
        
        int i = 0; // for left array
        int j = 0; // for right array
        int k = start; // for the nums
        long count = 0;
        
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            }else{
                count += left.length - i;
                nums[k++] = right[j++];
            }
        }
        
        while(i < left.length) nums[k++] = left[i++];
        while(j < right.length) nums[k++] = right[j++];
        
        return count;
        
    }

}



// ROUGH WORK









