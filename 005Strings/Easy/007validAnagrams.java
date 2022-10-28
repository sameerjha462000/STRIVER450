// problem -- https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length() != t.length()) return false;
        
        for(int i = 0 ; i < s.length();i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }
        
        for(Character ch : map.keySet()){
            if(map.get(ch) != 0) return false;
        }
        
        return true;
    }
}


// ROUGH WORK




