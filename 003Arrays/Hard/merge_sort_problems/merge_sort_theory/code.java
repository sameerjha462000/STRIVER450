    private static void mergeSort(int[] nums, int start, int end){
        if(start > end)
            return;
        if(start == end)
            return;
        
        int mid = (start + end) / 2;

        mergeSort(nums, start, mid); // sorts the array from [start, mid]
        mergeSort(nums, mid + 1, end); // sorts the array from [mid+1, end]

        mergeTwoSortedArrays(nums, start, mid, end);
             
    }

    private static void mergeTwoSortedArrays(int[] nums, int start, int mid, int end){
        int leftSize = mid - start + 1; // size of the first half
        int rightSize = end - mid; // end - (mid + 1) + 1 // size of the second half

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // copy the elements from start to mid in the left array
        int leftPointer = 0;
        for(int i = start; i <= mid; i++){
            left[leftPointer++] = nums[i];
        }

        // copy the elements from mid+1 to end in the right array
        int rightPointer = 0;
        for(int i = mid+1; i <= end;i++){
            right[rightPointer++] = nums[i];
        }

        // Now fill the original array
        int i = 0; // This will iterate over the left array
        int j = 0; // This will iterate over the right array
        int k = start; // for filling the original array

        while(i < left.length && j < right.length){
            // fill the original array
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            }else{
                nums[k++] = right[j++];
            }
        }

        while(i < left.length){ // If i was remaining
            nums[k++] = left[i++];
        }

        while(j < right.length){ // If j was remaining
            nums[k++] = right[j++];
        }
    }


    // ROUGH WORK







    