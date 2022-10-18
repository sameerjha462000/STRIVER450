// problem -- https://bit.ly/3zRzmAo

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ APPROACH 1 (NOT OPTIMAL BUT LEARNT SOMETHING NEW) ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ METHOD 2 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

// DONT KNOW WHY THIS WORKS
class Solution{
    public static void merge(int[] nums1, int[] nums2){
        int i = 0;
        int k = nums1.length;

        int j = 0;

        // Everything from 0 to i-1 would be sorted in the nums1
        while(i <= k && j < m){
            if(nums1[i] <= nums2[j]){
                // All the elements with index < i are at their correct place and after the ith index nums1[index] > nums1[i] which means that even if nums2[j] > nums1[i], it cannot be before or at the index i in the nums1 array
                // That is the reason we can safely increment i
                i++;
            }else{
                int temp = nums2[j];
                nums2[j] = nums1[k];
                nums1[k] = temp;

                k--;
                j++;
            }
        }


        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
}