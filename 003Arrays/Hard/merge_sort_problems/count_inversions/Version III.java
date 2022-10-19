class Solution
{
    // 
    public static long inversionCount(long nums[], long N)
    {
        return mergeSort(nums, new long[nums.length], 0, nums.length-1);
    }
    
    private static long mergeSort(long[] nums, long[] temp, int start, int end){
        long invCount = 0;
        if(start < end){
            int mid = (start + end) / 2;
            
            invCount += mergeSort(nums, temp, start, mid);
            invCount += mergeSort(nums, temp, mid+1, end);
            
            invCount += mergeTwoSortedArrays(nums, temp, start, mid, end);
        }
        
        return invCount;
    }
    
    private static long mergeTwoSortedArrays(long[] nums, long[] temp, int start, int mid, int end){
        // nums is sorted from start to mid and mid+1 to end
        
        int i = start;
        int j = mid+1;
        int k = start;
        
        long count = 0;
        
        while(i <= mid && j <= end){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                count += mid - i + 1;
                temp[k++] = nums[j++];
            }
        }
        
        while(i <= mid) temp[k++] = nums[i++];
        while(j <= end) temp[k++] = nums[j++];
        
        
        // copy the values from the temp array to nums array
        for(int index = start; index <= end;index++){
            nums[index] = temp[index];
        }
        
        return count;
    }
}



// ROUGH WORK






