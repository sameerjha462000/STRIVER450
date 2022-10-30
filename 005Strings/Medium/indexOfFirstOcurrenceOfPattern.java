// problem -- https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        
        int a = haystack.length();
        int b = needle.length();
        
        // if a < b, then needle cannot be a substring of haystack.
        if(a < b) return -1;

        // if a = b, then needle can be a substring of haystack iff haystack is the same string as the needle
        if(a == b) {
            if(haystack.equals(needle)) return 0;
            return -1;
        }
        
        // a > b
        
        // consider |haystack| = 5 {0 <= index <= 4} and |needle| = 3 {0 <= index <= 2}, then the maximum possible index at which needle can be found in haystack is 5-3 = 2.
        for(int i = 0; i < a-b+1;i++){
            int count = 0;
            
            // assume that the needle starts at the index i then check if we are able to match b characters from the needle
            while(count < b && haystack.charAt(i+count) == needle.charAt(count)) count++;
            
            // if count == b that means we were able to match b characters and thus we have found the needle in the haystack starting from the index i
            if(count == b) return i;
        }
        
        // needle not found in the haystack
        return -1;
        
    }
}




// ROUGH WORK






