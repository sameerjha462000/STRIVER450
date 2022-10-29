// problem -- 
class Solution {
    public int beautySum(String s) {
        int ans = 0;
        
        for(int i = 0; i < s.length();i++){
            for(int j = i+1; j <= s.length();j++){
                String str = s.substring(i, j);
                
                ans += beauty(str);
            }
        }
        return ans;
    }
    
    private static int beauty(String str){
        int[] freq = new int[26];
        
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            int val = ch-'a';
            
            freq[val]++;
        }
        
        int maxf = Integer.MIN_VALUE;
        int minf = Integer.MAX_VALUE;
        
        for(int i = 0; i < 26;i++){
            if(freq[i] == 0) continue;
            
            maxf = Math.max(maxf, freq[i]);
            minf = Math.min(minf, freq[i]);
        }
        
        return maxf-minf;
    }
}



// ROUGH WORK






