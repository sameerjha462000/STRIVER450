/**
 * In binary search, it is important that we understand the search space clearly
 * 1. Loop will run there is no element in our search space.
 * 2. In case of increasing array, l can only change to m or m + 1
 * 3. In case of increasing array, r can only change to m or m - 1
 **/
private static int bs(int[] nums, int target){
	int index = -1;
	int l = 0;
	int r = nums.length - 1;

	// search space is [l, r]

	// loop will continue until the search space is empty
	while(l <= r){ // Here we have written l <= r because when l == r then also search space is having one element
		int m = l + (r-l)/2;

		if(nums[m] == target){
			return m;
		}else if(nums[m] < target){
			// since nums[m] < target and nums is sorted in non-increasing order. Thus nums[0] <= ... <= nums[m] < target
			// Thus the part of the array [0, m] is useless
			l = m + 1;
		}else{
			r = m - 1;
		}
	}

	return index;
}


