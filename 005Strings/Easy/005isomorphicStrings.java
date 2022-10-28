// problem -- https://leetcode.com/problems/isomorphic-strings/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        
        int i = 0;
        int j = 0;
        
        Map<Character, Character> charMap = new HashMap<>();
        Map<Character, Boolean> boolMap = new HashMap<>();
        
        while(i < s.length()){
            
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            
            if(!boolMap.containsKey(tt)){
                boolMap.put(tt, true);
                
                // ss might have occured previously and might have been mapped to some diff
                // character
                if(!charMap.containsKey(ss)){
                    charMap.put(ss, tt);
                }else{
                    // ss has already been mapped to some character
                    // Now let us check if that character is the same as the tt
                    if(charMap.get(ss) != tt) return false;
                }
            }else{
                // boolMap contains tt as true
                // this means that there has already been a character which has been mapped
                // to tt
                
                for(Character ch : charMap.keySet()){
                    if(charMap.get(ch) == tt && ch != ss) return false;
                }
            }
            i++;
        }
        
        return true;
        
    }
}





// ROUGH WORK







