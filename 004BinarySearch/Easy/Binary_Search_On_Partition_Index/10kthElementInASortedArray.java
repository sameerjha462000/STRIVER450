// problem -- https://bit.ly/3Amcomr
class Solution {
    public long kthElement( int nums1[], int nums2[], int n, int m, int k) {
        if(nums1.length > nums2.length) return kthElement(nums2, nums1, m, n, k);
        
        // if nums2 has less than k elements then we atleast need k-nums2.length elements from the first array. That is why we have initially set l to Math.max(0, k-nums2.length)
        int l = Math.max(0, k - nums2.length);

        // if nums1 has more elements than k, then we cannot select all the elements. Thus we can have atmost k element from the first array
        int r = Math.min(k, nums1.length);
        
        while(l <= r){
            // We want element which would be kth from the start. That means that we want the element at the k-1 th index of the sorted array.
            // Thus we want k elements on the left side of our partition.

            int cut1 = (l + r) >> 1;
            int cut2 = k - cut1;
            
            int aprev = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int bprev = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            
            int acurr = cut1 == nums1.length ? Integer.MAX_VALUE : nums1[cut1];
            int bcurr = cut2 == nums2.length ? Integer.MAX_VALUE : nums2[cut2];
            
            if(aprev <= bcurr && bprev <= acurr){
                // we have selected k elements
                // Now we need to find the maximum among them
                return (long)1 * Math.max(aprev, bprev);
            }else if(bprev > acurr){
                l = cut1+1;
            }else{
                r = cut1-1;
            }
        }
        
        return (long)0;
    }
}



// ROUGH WORK








