// problem -- https://bit.ly/3PtLWLM
class Solution
{
    // This problem is an example where recursion is the fastest
    private static long count = 0;
    static long inversionCount(long nums[], long N)
    {
        count = 0;
    
        mergeSort(nums, 0, nums.length-1);
        
        return count;
    }
    
    private static long[] mergeTwoSortedArrays(long[] one, long[] two){
        int i = 0;
        int j = 0;
        int k = 0;
        
        long[] ans = new long[one.length + two.length];
        
        while(i < one.length && j < two.length){
            if(one[i] <= two[j]){
                ans[k++] = one[i++];
            }else{
                count  += one.length-i;
                ans[k++] = two[j++];
            }
        }
        while(i < one.length){
            ans[k++] = one[i++];
        }
        
        while(j < two.length){
            ans[k++] = two[j++];
        }
        return ans;
    }
    
    private static long[] mergeSort(long[] nums, int start, int end){
        if(start == end){
            long[] base = new long[1];
            base[0] = nums[start];
            return base;
        }
        
        int mid = (start + end)/2;
        long[] one = mergeSort(nums, start, mid);
        long[] two = mergeSort(nums, mid +1 , end);
        
        long[] ans = mergeTwoSortedArrays(one, two);
        
        
        return ans;
    }
}


// ROUGH WORK








