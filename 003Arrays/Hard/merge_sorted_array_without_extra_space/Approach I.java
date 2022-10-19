// problem -- https://bit.ly/3zRzmAo
class Solution
{
    // space - O(1) and time complexity - O(nums1.length * nums2.length * log(nums2.length))
    // judge verdict -- passed 236 /317
    public static void merge(long nums1[], long nums2[]) 
    {
        int i = 0;
        
        while(i < nums1.length){
            // decide what element to be put at this index
            long val1 = nums1[i];
            long val2 = nums2[0];
            
            if(val2 < val1){
                long temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
                
                Arrays.sort(nums2);
            }
            i++;
        }
    }
}
