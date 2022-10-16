// problem -- https://bit.ly/3bZqbGc
class Solution{
    public static List<Integer> leaders(int nums[], int n){

        List<Integer> ans = new ArrayList<>();
        ans.add(nums[nums.length-1]); //  since the rightmost element is always a leader
        
        /**
         * We will keep a max variable which would store the maximum element from the right of the array
         **/

        int max = nums[nums.length-1];

        for(int i = nums.length-2;i>= 0;i--){
            // at this moment max is maximum value from the (i+1) th index till the last of the array.
            int val = nums[i];
            
            if(val >= max){
                /**
                 * Since val >= max, this means that it is greater than the maximum of all the elements from the (i+1)th index till the last of the array
                 * and thus it is greater than or equal to each element on its right.
                 * 
                 * Thus, it is a leader.
                 **/
                ans.add(val);
            }

            // for the next iteration we need to update the max
            max = Math.max(val, max);
        }
        
        reverse(ans);
        
        return ans;
    }

    private static void reverse(List<Integer> ans){
        int start = 0;
        int end = ans.size()-1;
        
        while(start <= end){
            // swap the values
            int temp = ans.get(start);
            ans.set(start, ans.get(end));
            ans.set(end, temp);

            // change the pointers
            start++;
            end--;
        }
    }
}



// ROUGH WORK





