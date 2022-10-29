// problem -- https://www.spoj.com/problems/NAJPF/
import java.util.*;
import java.lang.*;

class Main
{
	private static Scanner scn;
	public static void main (String[] args) throws java.lang.Exception
	{
		scn = new Scanner(System.in);
		
		int T = scn.nextInt();
		
		while(T-- != 0){
			solve();
		}
		
		scn.close();
	}
	
	private static void solve(){
		String str = scn.next();
		String pattern = scn.next();
		
		
		// find the hashcode of pattern
		long pow = 1;
		long p = 31;
		long hashCodeOfPattern = 0;
		long mod = 1000000007;
		
		for(int i = 0; i < pattern.length();i++){
			char ch = pattern.charAt(i);
			
			hashCodeOfPattern = (hashCodeOfPattern + (ch-'a'+1) * pow) % mod;
			pow = (pow * p) % mod;
		}
		
		// create the hash prefix array for str
		long[] dp = new long[str.length()];
		long[] pa = new long[str.length()];
		
		dp[0] = str.charAt(0)-'a'+1;
		pa[0] = 1;
		pow = p;
		
		for(int i = 1; i < str.length();i++){
			char ch = str.charAt(i);
			dp[i] = (dp[i-1] + (ch-'a'+1) * pow) % mod;
			pa[i] = pow;
			pow = (pow * p) % mod;
		}
		
		// for storing the position of pattern in the str
		List<Integer> ans = new ArrayList<>();
		
		int start = 0;
		int end = pattern.length()-1;
		
		while(end < str.length()){
			// we need to check the hashcode for the substring [start, end] == dp[end] - dp[start-1], but this poses a problem when start == 0
			long code = dp[end];
			if(start > 0) code = (code - dp[start-1] + mod) % mod;
			
			if(code == ((hashCodeOfPattern * pa[start]) % mod)) ans.add(start+1);
			start++;
			end++;
		}
		
		if(ans.size() == 0){
			System.out.println("Not Found");
			System.out.println();
		}else{
			System.out.println(ans.size());
			
			for(Integer pos : ans) System.out.print(pos + " ");
			System.out.println();
			System.out.println();
		}
	}
	
}



// ROUGH WORK






