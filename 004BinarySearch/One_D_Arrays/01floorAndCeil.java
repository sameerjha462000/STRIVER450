public static int[] floorAndCeil(int[] nums,int target){
    
    int l = 0;
    int r = nums.length - 1;

    int floor = -1;
    int ceil = -1;

    while(l <= r){
        int m = (l + r)/2;
        if(nums[m] == target){
            floor = m;
            ceil = m;
            break;
        }else if(nums[m] < target){
            floor = m;
            l = m + 1;
        }else{
            ceil = m;
            right = m - 1;
        }
    }

    // timepass
    int[] ans = new int[2];
    ans[0] = nums[floor];
    ans[1] = nums[ceil];

    return ans;
}


// ROUGH WORK







