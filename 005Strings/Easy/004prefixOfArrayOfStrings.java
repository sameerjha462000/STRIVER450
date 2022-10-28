// problem -- https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs){

        // we will assume that the first string is the prefix and then trim it while iterating through the other strings in the string
        String prefix = strs[0];
        
        // iterating over the other strings
        for(int i = 1; i < strs.length;i++){
            
            // Think over this...
            while(strs[i].indexOf(prefix) != 0){
                // str1.indexOf(str2) method returns the starting index of the first occurence of the str2 in str1.
                // If it does not find str2 in the str1, then it returns -1.

                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        
        return prefix;
    }
}


// ROUGH WORK




