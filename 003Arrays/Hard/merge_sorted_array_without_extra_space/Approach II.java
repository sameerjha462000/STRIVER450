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