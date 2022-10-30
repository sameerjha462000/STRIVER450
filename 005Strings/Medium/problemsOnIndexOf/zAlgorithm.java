// problem -- https://bit.ly/3qs24UM
public class Solution {

    // finds the number of times p occurs in s
	public static int zAlgorithm(String s, String p, int n, int m) {

        if(n < m) return 0;

        if(n==m){
            if(s.equals(p)) return 1;
            else return 0;
        }
        
        int ans = 0;
        for(int i = 0; i < n-m+1;i++){
            int count = 0;
            
            while(count < m && s.charAt(i+count) == p.charAt(count)) count++;
            if(count == m) ans++;
         
        }
        return ans;

	}

}


// ROUGH WORK





