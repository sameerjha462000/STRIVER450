// problem -- https://bit.ly/3pFDbUN
class Solution
{
    public static int searchInsertK(int nums[], int N, int k)
    {
        int ceil = -1;
        int floor = -1;
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] == k)  return mid;
            else if(nums[mid] < k){
                floor = mid;
                start = mid+1;
            }else{
                ceil = mid;
                end = mid-1;
            }
        }
        
        // If the element to be inserted is the smallest, then ceil would be at 0 and the floor would be at -1.
        // Thus element would be inserted at the 0th index
        if(floor == -1 && ceil != -1){
            return 0;
        }
        
        // If the element to be inserted is the largest, then floor would be at nums.length-1 and ceil would be at -1
        // Thus element would be inserted at the nums.length index
        if(floor != -1 && ceil == -1){
            return nums.length;
        }
        return ceil;
    }
}


// ROUGH WORK








