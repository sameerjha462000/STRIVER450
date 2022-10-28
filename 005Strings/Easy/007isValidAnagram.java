// problem -- https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        // if the lengths of the strings are different, how could they be anagrams of each other ?
        if(s.length() != t.length()) return false;
        
        for(int i = 0 ; i < s.length();i++){
            
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);

            // the characters of the s should increase the frequency in the map
            map.put(ch, map.getOrDefault(ch, 0) + 1);
    
            // the characters of the t should decrease the frequency in the map
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }
        
        // claim := If (s, t) are anagrams, then after the above process all the keys in the map must have 0 as their value.
        for(Character ch : map.keySet()){

            // if there exists a key which has non-zero value, then (s, t) are NOT anagrams.
            if(map.get(ch) != 0) return false;
        }
        
        return true;
    }
}



// ROUGH WORK






