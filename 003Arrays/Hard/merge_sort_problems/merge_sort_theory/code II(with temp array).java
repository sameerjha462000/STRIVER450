    // In this code we make common temporary array

    private static void mergeSort(int[] nums, int[] temp, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(nums, temp, start, mid);
            mergeSort(nums, temp, mid+1, end);

            mergeTwoSortedArrays(nums, temp, start, mid, end);

        }
    }

    private static void mergeTwoSortedArrays(int[] nums, int[] temp, int start, int mid, int end){
        // Assumptions 
        // The part from start to mid and mid + 1 to end has been sorted.
        // We just need to sort the part from start to end

        int i = start;
        int j = mid + 1;
        int k = start;

        while(i <= mid && j <= end){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i <= mid) temp[k++] = nums[i++];
        while(j <= end) temp[k++] = nums[j++];

        // Now everything in the temp array from start to end is sorted so just copy it
        for(int index = start; index <= end;index++){
            nums[index] = temp[index];
        }
    }



    // ROUGH WORK








