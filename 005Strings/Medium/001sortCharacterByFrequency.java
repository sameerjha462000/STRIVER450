// problem -- https://leetcode.com/problems/sort-characters-by-frequency/
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(Character ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!pq.isEmpty()){
            Pair removed = pq.remove();
            Character ch = removed.ch;
            int freq = removed.freq;
            
            while(freq-- != 0){
                ans.append(ch);
            }
        }
        
        return ans.toString();
        
    }
    
    private static class Pair implements Comparable<Pair>{
        Character ch;
        int freq;
        
        Pair(){}
        Pair(Character ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
        Pair(Pair other){
            this.ch = other.ch;
            this.freq = other.freq;
        }
        
        @Override
        public int compareTo(Pair other){
            return other.freq - this.freq;
        }
        @Override
        public String toString(){
            return ch + " " + freq;
        }
    }
    
    
}



// ROUGH WORK









