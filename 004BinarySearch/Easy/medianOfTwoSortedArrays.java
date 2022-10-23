// problem -- https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b){
        if(a.length > b.length) return findMedianSortedArrays(b, a);
        
        int l = 0;
        int r = a.length; // why ? (We are putting the pointers NOT on the elements BUT on their previous borders)
        
        int te = a.length + b.length;
        while(l <= r){
            int cut1 = l + (r-l)/2;
            int cut2 = (te+1)/2 - cut1;
            
            int aprev = cut1 == 0 ? Integer.MIN_VALUE : a[cut1-1]; // means there are no elements on the left of the cut1 in a
            int bprev = cut2 == 0 ? Integer.MIN_VALUE : b[cut2-1]; // means there are no elements on the left of the cut2 in b
            
            int acurr = cut1 == a.length ? Integer.MAX_VALUE : a[cut1]; // means there are no elements on the right of the cut1 in a
            int bcurr = cut2 == b.length ? Integer.MAX_VALUE : b[cut2]; // means there are no elements on the right of the cut2 in b
            
            
            if(aprev <= bcurr && bprev <= acurr){
                // This is the right partitioning of the two arrays
                if(te % 2 == 0){

                    // If the total number of elements is even then we have two possible candidates for median so we just take the mean of them
                    int lmax = Math.max(aprev, bprev);
                    int rmax = Math.min(acurr, bcurr);
                    
                    return (lmax+rmax)/(2.0);
                }else{
                    // In case the number of elements is odd we just have one median
                    return 1.0 * Math.max(aprev, bprev);
                }
            }else if(bprev > acurr){
                l = cut1+1;
            }else{
                r = cut1-1;
            }
        }
        
        
        return 0.0;
    }
}




// ROUGH WORK







