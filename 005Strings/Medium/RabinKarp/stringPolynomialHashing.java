// This is called string polynomial hashing
private static long hashcode(String s){
	long p = 31; // the reason why we took prime as 31 as |English_Alphabet| = 26. So, the prime used for hashing must be greater than 26. We could have also chosen 29 or 31.
	long pow = 1;
	long mod = 1000000007; // for preventing integer overflow
	long ans = 0;

	for(int i = 0; i < s.length();i++){
		char ch = s.charAt(i);

		// ch-'a'+1 tells us the position of ch in the English Alphabet
		ans = (ans + (ch-'a'+1) * pow) % mod;
		pow = (pow * p) % mod;
	}

	return ans;
}



// ROUGH WORK

/**
 * The reason why we did not take a prime less than 26 is that we could have ended up with collision ?
 * 
 * For example := "aa" and "f" and let us take the prime as 5. Then the hashcode("f") = 'f'-'a'+1 = 6 and the hashcode("aa") = ('a'-'a'+1) * 1 + ('a'-'a'+1) * 5 = 1 + 5 = 6
 * which is a collision.
 * 
 * 
 * Also, the reason why we took ch-'a'+1 and not ch-'a' is again to avoid collision as then hashcode("a") = 'a'-'a' = 0 and hashcode("aa") = ('a'-'a') * 1 + ('a'-'a') * 31 = 0 + 0 = 0
 * Hence, we have a collision again
 **/




